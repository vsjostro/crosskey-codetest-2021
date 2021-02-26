package com.vsjostro.customer;

public class Customer {

    private String name;
    private double loanTotal, interest;
    private int years;
    private String monthlyPayment;

    public Customer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoanTotal(double loanTotal) {
        this.loanTotal = loanTotal;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getName() {
        return name;
    }

    public double getLoanTotal() {
        return loanTotal;
    }

    public double getInterest() {
        return interest;
    }

    public int getYears() {
        return years;
    }

    public String getMonthlyPayment() {return monthlyPayment;}

}
