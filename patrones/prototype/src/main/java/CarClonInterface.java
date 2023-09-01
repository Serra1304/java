/**
 * Clase que representa un coche y permite su clonacion a traves de la interfaz Cloneable
 */
public class CarClonInterface implements Cloneable {
    private String brand;
    private String model;
    private double engine;
    private double power;

    /**
     * Crea una copia del objeto con las mismas propiedades que el objeto actual
     * @return Una instancia con las mismas propiedades que el objeto actual
     * @throws CloneNotSupportedException Si la clonacion no es compatible o existe algun error
     */
    public CarClonInterface clon() throws CloneNotSupportedException {
        return (CarClonInterface)this.clone();
    }

    /**
     * Obtiene la marca del coche
     * @return la marca del coche
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Establece la marca del coche
     * @param brand La nueva marca del coche
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Obtiene el modelo del coche
     * @return El modelo del coche
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del coche
     * @param model El nuevo modelo del coche
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el motor del coche
     * @return El motor del coche
     */
    public double getEngine() {
        return engine;
    }

    /**
     * Establece el motor del coche
     * @param engine El nuevo motor del coche
     */
    public void setEngine(double engine) {
        this.engine = engine;
    }

    /**
     * Obtiene la potencia del coche
     * @return La potencia del coche
     */
    public double getPower() {
        return power;
    }


    /**
     * Establece la potencia del coche
     * @param power La nueva potencia del coche
     */
    public void setPower(double power) {
        this.power = power;
    }
}
