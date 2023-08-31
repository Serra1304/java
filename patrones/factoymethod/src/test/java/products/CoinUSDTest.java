package products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinUSDTest {
    @Test
    public void testPrice() {
        CoinUSD coinUSD = new CoinUSD();
        assertEquals(0.9, coinUSD.value());
    }

    @Test
    public void testCountry() {
        CoinUSD coinUSD = new CoinUSD();
        assertEquals("US", coinUSD.country());
    }
}
