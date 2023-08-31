package products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinEURTest {
    @Test
    public void testPrice() {
        CoinEUR coinEUR = new CoinEUR();
        assertEquals(1.2, coinEUR.value());
    }

    @Test
    public void testCountry() {
        CoinEUR coinEUR = new CoinEUR();
        assertEquals("España", coinEUR.country());
    }
}
