/**
 * Clase abstracta que implementa la interfaz Coffee.
 * Esta clase sirve como base para los decoradores de café que agregan funcionalidad adicional.
 */
public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    /**
     * Constructor de CoffeDecorator.
     * @param coffee Objeto de tipo Coffee al que se le agregara funcionalidad.
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    /**
     * Obtiene una descripcion del cafe decorado.
     * @return Un String del cafe decorado.
     */
    @Override
    public String description() {
        return coffee.description();
    }

    /**
     * Obtiene el precio del cafe decorado.
     * @return Un double con el precio del cafe decorado.
     */
    @Override
    public double price() {
        return coffee.price();
    }
}
