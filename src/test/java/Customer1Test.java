import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Customer1Test {

    Customer customer;
    Customer1 customer1;

    @Before
    public void before() {
        customer1 = new Customer1(15, 1.68, 30);
    }

    @Test
    public void canGetAge() {
        assertEquals(15, customer1.getAge());
    }

    @Test
    public void canGetHeight() {
        assertTrue(1.68 == customer1.getHeight());
    }

    @Test
    public void canGetCustomersMoney() {
        assertEquals(30, customer1.getMoney());
    }

}
