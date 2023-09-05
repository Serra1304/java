/**
 * Implementacion basica de la interfaz Coffee.
 * Esta clase representa un cafe simple con una descripcion y un precio predeterminado.
 */
public class BasicCoffee implements Coffee {

    /**
     * Obtiene la descripcion del cafe basico.
     * @return Un String con la descripcion del cafe basico.
     */
    @Override
    public String description() {
        return "Cafe";
    }

    /**
     * Obtiene el precio para el cafe basico.
     * @return El precio del cafe basico.
     */
    @Override
    public double price() {
        return 1.0;
    }
}
