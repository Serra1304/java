package cars;

import components.Engine;
import components.Extras;
import components.Transmission;

public class Car {
    private Cartype cartype;
    private Engine engine;
    private Transmission transmission;
    private Extras extras;
    private int seats;
    private int wheels;

    public Car(Cartype cartype, Engine engine, Transmission transmission, Extras extras, int seats, int wheels) {
        this.cartype = cartype;
        this.engine = engine;
        this.transmission = transmission;
        this.extras = extras;
        this.seats = seats;
        this.wheels = wheels;
    }

    public Car() {
    }

    public Cartype getCartype() {
        return cartype;
    }

    public void setCartype(Cartype cartype) {
        this.cartype = cartype;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

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
