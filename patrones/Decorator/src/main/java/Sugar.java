/**
 * Clase que representa un decorador con azúcar para el cafe.
 * Es clase extiende de CoffeeDecorator y agrega funcionalidad para describir y calcular el precio del cafe con azúcar.
 */
public class Sugar extends CoffeeDecorator {
    private final Coffee coffee;

    /**
     * Constructor de la clase Sugar.
     * @param coffee Objeto de tipo Coffee al que se le agrega azúcar.
     */
    public Sugar(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }

    /**
     * Obtiene la descripcion para el cafe con azúcar.
     * @return Un String con la descripcion del cafe con azúcar.
     */
    @Override
    public String description() {
        return coffee.description() + " con azúcar";
    }

    /**
     * Obtiene el precio del cafe con azúcar.
     * @return Un double con el precio del cafe con azúcar.
     */
    @Override
    public double price() {
        return coffee.price() + 0.2;
    }
}
