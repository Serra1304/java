import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilkTest {

    @Test
    public void testMilk() {
        Coffee coffeeMilk = new Milk(new BasicCoffee());

        assertEquals("Cafe con leche", coffeeMilk.description());
        assertEquals(1.5, coffeeMilk.price());
    }

    @Test
    public void testMilkSugar() {
        Coffee coffeeMilkSugar = new Sugar(new Milk(new BasicCoffee()));

        assertEquals("Cafe con leche con azúcar", coffeeMilkSugar.description());
        assertEquals(1.7, coffeeMilkSugar.price());
    }
}
