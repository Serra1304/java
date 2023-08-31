package creators;

import factory.Coin;
import factory.CoinCreator;
import products.CoinEUR;

/**
 * Clase concreta para crear la instancia de la moneda {@link CoinEUR}
 */
public class CoinEURCreator extends CoinCreator {

    /**
     * Crea una nueva instancia de la moneda Euro
     * @return Retorna la instancia de la moneda Euro
     */
    @Override
    public Coin createCoin() {
        return new CoinEUR();
    }
}
