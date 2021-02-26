package com.vsjostro.web.controller;

public class Calculator {

    public static double calculateMortgage(double loanTotal, double interest, int years) {

        int payments = years * 12;
        interest = interest / 100 / 12;
        double monthlyPayment = (loanTotal * (interest * (power((1 + interest), payments)))) / (((power((1 + interest), payments) - 1)));

        return monthlyPayment;
    }

    public static double power(double value, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {

            result *= value;
        }

        return result;
    }
}
