package factory;

/**
 * Interfaz que representa una moneda
 */
public interface Coin {
    /**
     * Valor de la moneda
     * @return Retorna el valor de la moneda
     */
    double value();

    /**
     * Pais de la moneda
     * @return Retorna el pais de la moneda
     */
    String country();
}
