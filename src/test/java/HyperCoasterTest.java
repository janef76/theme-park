import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HyperCoasterTest {
    Ride ride;
    HyperCoaster hyperCoaster;

    @Before
    public void before() {
        this.hyperCoaster = new HyperCoaster("Hypercoaster", 10, 12, 1.60);
    }

    @Test
    public void coasterHasName() {
        assertEquals("Hypercoaster", hyperCoaster.getName());
    }

    @Test
    public void coasterHasPrice() {
        assertEquals(10, hyperCoaster.getPrice());
    }

    @Test
    public void coasterHasMinAge() {
        assertEquals(12, hyperCoaster.getMinAge());
    }

    @Test
    public void coasterHasMinHeight() {
        assertTrue(1.60 == hyperCoaster.getMinHeight());
    }

}
