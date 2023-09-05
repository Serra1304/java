/**
 * Clase que representa un decorador con leche para el cafe.
 * Esta clase extiende de CoffeeDecorator y agrega funcionalidad para describir y calcular el precio del cafe con leche.
 */
public class Milk extends CoffeeDecorator {
    private final Coffee coffee;

    /**
     * Constructor de la clase Milk.
     * @param coffee Objeto de tipo Coffee al que se le agregara leche.
     */
    public Milk(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }

    /**
     * Obtiene una descripcion para el cafe con leche.
     * @return Un String con la descripcion del cafe con leche.
     */
    @Override
    public String description() {
        return coffee.description() + " con leche";
    }

    /**
     * Obtiene el precio para el cafe con leche.
     * @return un double con el precio del cafe con leche.
     */
    @Override
    public double price() {
        return  coffee.price() + 0.5;
    }
}
