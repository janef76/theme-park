import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WingCoasterTest {

    Ride ride;
    WingCoaster wingCoaster;

    @Before
    public void before() {
        this.wingCoaster = new WingCoaster("Wingcoaster", 5, 9, 1.50);
    }

    @Test
    public void coasterHasName() {
        assertEquals("Wingcoaster", wingCoaster.getName());
    }

    @Test
    public void coasterHasPrice() {
        assertEquals(5, wingCoaster.getPrice());
    }

    @Test
    public void coasterHasMinAge() {
        assertEquals(9, wingCoaster.getMinAge());
    }

    @Test
    public void coasterHasMinHeight() {
        assertTrue(1.50 == wingCoaster.getMinHeight());
    }
}
