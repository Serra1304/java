package builder;

import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;


public class CarBuilder implements BuilderInterface{
    private final Car car = new Car();

    @Override
    public void setCarType(Cartype cartype){
        car.setCartype(cartype);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setExtras(Extras extras) {
        car.setExtras(extras);
    }

    @Override
    public void setTransmission(Transmission transmission) {
        car.setTransmission(transmission);
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setWheels(int wheels) {
        car.setWheels(wheels);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
