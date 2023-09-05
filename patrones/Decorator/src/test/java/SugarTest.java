import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SugarTest {

    @Test
    public void testSugar() {
        Coffee coffeeSugar = new Milk(new BasicCoffee());
        assertEquals("Cafe con leche", coffeeSugar.description());
        assertEquals(1.5, coffeeSugar.price());
    }

    @Test
    public void testSugarMilk() {
        Coffee coffeeSugarMilk = new Milk(new Sugar(new BasicCoffee()));
        assertEquals("Cafe con azúcar con leche", coffeeSugarMilk.description());
        assertEquals(1.7, coffeeSugarMilk.price());
    }
}

