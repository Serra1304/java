package factory;

/**
 * Clase abstracta para crear instancias de las monedas
 */
public abstract class CoinCreator {
    /**
     * Crea una nueva instancia de la moneda
     * @return Retorna la instancia de la moneda
     */
    public abstract Coin createCoin();

    /**
     * Obtiene la moneda creada y mouestra el pais y el valor de la moneda.
     */
    public void getPrice() {
        Coin coin = createCoin();
        System.out.println("El precio en " + coin.country() + " es: " + coin.value());
    }
}
