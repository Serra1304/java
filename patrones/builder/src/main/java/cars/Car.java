package cars;

import components.Engine;
import components.Extras;
import components.Transmission;

/**
 * La clase Car representa un coche con diferentes atributos configurables, como tipo, motor, transmisión, extras,
 * número de asientos y tamaño de las ruedas. Proporciona métodos para acceder y configurar estos atributos, así como
 * para listar la configuración del automóvil.
 */
public class Car {
    private Cartype cartype;
    private Engine engine;
    private Transmission transmission;
    private Extras extras;
    private int seats;
    private int wheels;

    /**
     * Constructor que permite configurar todos los atributos del coche.
     *
     * @param cartype Tipo de coche.
     * @param engine Motor del coche.
     * @param transmission Tipo de transmision del coche.
     * @param extras Extras del coche.
     * @param seats Número de asientos que tiene el coche.
     * @param wheels Tamaño de las ruedas del coche
     */
    public Car(Cartype cartype, Engine engine, Transmission transmission, Extras extras, int seats, int wheels) {
        this.cartype = cartype;
        this.engine = engine;
        this.transmission = transmission;
        this.extras = extras;
        this.seats = seats;
        this.wheels = wheels;
    }

    /**
     * Constructor que inicializa el objeto Car sin configurarion inicial.
     */
    public Car() {
    }

    /**
     * Obtiene el tipo de coche.
     *
     * @return El tipo de coche.
     */
    public Cartype getCartype() {
        return cartype;
    }

    /**
     * Establece el tipo de coche.
     *
     * @param cartype Nuevo tipo de coche.
     */
    public void setCartype(Cartype cartype) {
        this.cartype = cartype;
    }

    /**
     * Obtiene el motor del coche.
     *
     * @return El motor del coche.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Estable el motor del coche.
     *
     * @param engine Nuevo motor del coche.
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * Obtiene el tipo de transmision del coche.
     *
     * @return el tipo de transamision del coche.
     */
    public Transmission getTransmission() {
        return transmission;
    }

    /**
     * Establece la transmision del coche.
     *
     * @param transmission Nuevo tipo de transmision del coche.
     */
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    /**
     * Obtiene los extras del coche.
     *
     * @return Los extras del coche.
     */
    public Extras getExtras() {
        return extras;
    }

    /**
     * Establece los extras del coche.
     *
     * @param extras Nuevos extras del coche.
     */
    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    /**
     * Obtiene el numero de asientos del coche.
     *
     * @return el número de asientos del coche.
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Establece el número de asientos del coche.
     *
     * @param seats Nuevo número de asientos del coche.
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * Obtiene el tamaño de las ruedas del coche.
     *
     * @return El tamaño de las ruedas del coche.
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Establece el tamaño de las ruedas del coche.
     *
     * @param wheels Nuevo tamaño de las ruedas del coche.
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Imprime la configuracion detallada del coche en la consola.
     */
    public void listConfiguration() {
        System.out.println("Coche " + cartype.getType() + ":");
        System.out.println("============================");
        System.out.println("Motor: " + engine.volume() + " L / " + engine.power() + " cv");
        System.out.println("Transmision: " + transmission.getTransmimssion());
        System.out.println("Numero de asientos: " + seats);
        System.out.println("Llantas: " + wheels + " pulgadas");
        System.out.println("Extras: " + extras.getExtras());
    }
}
