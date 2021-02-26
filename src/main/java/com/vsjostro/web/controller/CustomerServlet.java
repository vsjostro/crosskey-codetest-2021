package com.vsjostro.web.controller;

import com.vsjostro.customer.Customer;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Connection connection;
        Statement statement;
        ResultSet resultSet;
        ArrayList<Customer> customerList = new ArrayList<>();

        try {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:customer.sqlite";
            connection = DriverManager.getConnection(url);
            System.out.println("Connected");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customers;");

            while (resultSet.next()) {

                double monthlyPayment;
                String customerName = resultSet.getString("name");
                double loanTotal = resultSet.getDouble("loanTotal");
                double interest = resultSet.getDouble("interest");
                int years = resultSet.getInt("years");

                monthlyPayment = Calculator.calculateMortgage(loanTotal, interest, years);
                Customer customer = new Customer();
                customer.setName(customerName);
                customer.setLoanTotal(loanTotal);
                customer.setInterest(interest);
                customer.setYears(years);
                customer.setMonthlyPayment(String.format("%.2f", monthlyPayment));

                customerList.add(customer);

            }



        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        request.setAttribute("customerList", customerList);

        getServletContext().getRequestDispatcher("/jsp/customer.jsp").forward(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        getServletContext().getRequestDispatcher("/jsp/customer.jsp").forward(request, response);
    }


}