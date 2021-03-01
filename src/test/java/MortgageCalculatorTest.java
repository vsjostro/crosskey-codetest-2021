import com.vsjostro.model.Customer;
import org.junit.Test;


import static org.junit.Assert.*;


public class MortgageCalculatorTest {

    @Test
    public void addCustomer() {
        Customer customer = new Customer();
        customer.setName("Juha");
        customer.setLoanTotal(1000);
        customer.setInterest(5);
        customer.setYears(2);
        assertEquals("Juha", customer.getName());
    }
}
