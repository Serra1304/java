package products;

import factory.Coin;

/**
 * Implementacion de la interfaz {@link Coin} que representa una moneda de Euro
 */
public class CoinEUR implements Coin {
    /**
     * Obtiene el valor de la moneda Euro
     * @return Retorna el valor de la moneda Euro
     */
    @Override
    public double value() {
        return 1.2;
    }

    /**
     * Obtiene el pais de la moneda Euro
     * @return Retorna el pais de la moneda Euro
     */
    @Override
    public String country() {
        return "España";
    }
}
