package products;

import factory.Coin;

/**
 * Implementa la interfaz {@link Coin} que representa la moneda Dolar
 */
public class CoinUSD implements Coin {
    /**
     * Obtiene el valor de la moneda Dolar
     * @return Retorna el valor de la moneda Dolar
     */
    @Override
    public double value() {
        return 0.9;
    }

    /**
     * Obtiene el pais de la moneda Dolar
     * @return Retorna el pais de la moneda Dolar
     */
    @Override
    public String country() {
        return "US";
    }
}
