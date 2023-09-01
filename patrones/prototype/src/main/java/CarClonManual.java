/**
 * Clase que representa un coche y permite su colonacion de forma manual.
 */
public class CarClonManual {
    private String brand;
    private String model;
    private double engine;
    private double power;

    /**
     * Constructor por defecto
     */
    public CarClonManual() {
    }

    /**
     * Crea y copia un objeto CarClonManual con las mismas propiedades que el objeto actual
     * @return Una instancia CarClonManual con las mismas propiedades
     */
    public CarClonManual clon() {
        CarClonManual clon = new CarClonManual();

        clon.brand = brand;
        clon.model = model;
        clon.engine = engine;
        clon.power = power;

        return clon;
    }

    /**
     * Obtiene la marca del coche
     * @return La marca del coche
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
     * @return el modelo del coche
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
