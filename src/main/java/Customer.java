class Customer {

    private String name;
    private double loanTotal, interest;
    private int years;

    Customer(String name, double loanTotal, double interest, int years) {
        this.name = name;
        this.loanTotal = loanTotal;
        this.interest = interest;
        this.years = years;
    }


    String getName() {
        return name;
    }

    double getLoanTotal() {
        return loanTotal;
    }

    double getInterest() {
        return interest;
    }

    int getYears() {
        return years;
    }

}
