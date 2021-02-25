import java.sql.*;

public class MortgageCalculator {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;

        try {

            String url = "jdbc:sqlite:customer.sqlite";
            connection = DriverManager.getConnection(url);
            System.out.println("Connected");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customers;");

            while (resultSet.next()) {
                String customerName = resultSet.getString("name");
                double loanTotal = resultSet.getDouble("loanTotal");
                double interest = resultSet.getDouble("interest");
                int years = resultSet.getInt("years");

                Customer customer = new Customer(customerName, loanTotal, interest, years);

                calculate(customer);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static void calculate(Customer customer) {
        double monthlyPayment;
        String name = customer.getName();
        double interest = customer.getInterest() / 100 / 12;
        int payments = 12 * customer.getYears();
        double loanTotal = customer.getLoanTotal();

        monthlyPayment = (loanTotal * (interest * (power((1 + interest), payments)))) / (((power((1 + interest), payments) - 1)));


        System.out.println("****************************************************************************************************");
        System.out.println(name + " wants to borrow " + loanTotal + " for a period of " + customer.getYears() + " years and pay " + String.format("%.2f", monthlyPayment) + " each month.");
        System.out.println("**************************************************************************************************** \n");

    }

    public static double power(double value, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {

            result *= value;
        }


        return result;

    }
}
