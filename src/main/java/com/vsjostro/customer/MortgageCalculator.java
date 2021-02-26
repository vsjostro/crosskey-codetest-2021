package com.vsjostro.customer;

import java.sql.*;

import static com.vsjostro.web.controller.Calculator.calculateMortgage;

public class MortgageCalculator {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;
        String customerName;
        double loanTotal, interest, monthlyPayment;
        int years;

        try {

            String url = "jdbc:sqlite:customer.sqlite";
            connection = DriverManager.getConnection(url);
            System.out.println("Connected");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customers;");

            while (resultSet.next()) {
                customerName = resultSet.getString("name");
                loanTotal = resultSet.getDouble("loanTotal");
                interest = resultSet.getDouble("interest");
                years = resultSet.getInt("years");

                Customer customer = new Customer();
                customer.setName(customerName);
                customer.setLoanTotal(loanTotal);
                customer.setInterest(interest);
                customer.setYears(years);

                monthlyPayment = calculateMortgage(loanTotal, interest, years);

                System.out.println("****************************************************************************************************");
                System.out.println(customerName + " wants to borrow " + loanTotal + " for a period of " + years + " years and pay " + String.format("%.2f", monthlyPayment) + " each month.");
                System.out.println("**************************************************************************************************** \n");


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
