package builder;

import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;

public interface BuilderInterface {
    void setCarType(Cartype cartype);
    void setEngine(Engine engine);
    void setExtras(Extras extras);
    void setTransmission(Transmission transmission);
    void setSeats(int seats);
    void setWheels(int wheels);
    Car getCar();
}
