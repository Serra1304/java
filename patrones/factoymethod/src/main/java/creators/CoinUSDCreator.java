package creators;

import factory.Coin;
import factory.CoinCreator;
import products.CoinUSD;

/**
 * Clase concreta para crear una instancia de la moneda {@link CoinUSD}
 */
public class CoinUSDCreator extends CoinCreator {
    /**
     * Crea una nueva instancia de la moneda Dolar
     * @return Retorna la instancia de la moneda Dolar
     */
    @Override
    public Coin createCoin() {
        return new CoinUSD();
    }
}
