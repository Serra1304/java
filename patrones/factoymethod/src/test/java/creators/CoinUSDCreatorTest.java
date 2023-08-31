package creators;

import factory.Coin;
import factory.CoinCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinUSDCreatorTest {
    @Test
    public void testCoinUSDCreation() {
        CoinCreator usdCreator = new CoinUSDCreator();
        Coin usdCoin = usdCreator.createCoin();

        assertNotNull(usdCoin);
        assertTrue(usdCoin instanceof Coin);
    }
}
