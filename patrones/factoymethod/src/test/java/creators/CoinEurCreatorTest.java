package creators;

import factory.Coin;
import factory.CoinCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinEurCreatorTest {
    @Test
    public void testCoinEURCreation() {
        CoinCreator eurCreator = new CoinEURCreator();
        Coin eurCoin = eurCreator.createCoin();

        assertNotNull(eurCoin);
        assertTrue(eurCoin instanceof Coin);
    }
}
