import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCoffeeTest {

    @Test
    public void testBasicCoffee() {
        Coffee coffee = new BasicCoffee();

        assertEquals("Cafe", coffee.description());
        assertEquals(1.0, coffee.price(), 0.001);
    }
}
