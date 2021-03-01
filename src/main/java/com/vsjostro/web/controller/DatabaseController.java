package com.vsjostro.web.controller;

import com.vsjostro.model.Customer;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseController {

    public static void getCustomers(ArrayList customerList) {


        Connection connection;
        Statement statement;
        ResultSet resultSet;

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

    }

    public static void addCustomer(String name, String loanTotal, String interest, String years) {
        Connection connection;
        Statement statement;

        try {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:customer.sqlite";
            connection = DriverManager.getConnection(url);
            System.out.println("Connected");

            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO customers(Name, LoanTotal, Interest, Years) VALUES ('"+ name + "','"+ loanTotal +"','"+ interest + "','" + years + "');");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
