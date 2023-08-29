package director;

import builder.BuilderInterface;
import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;

import java.util.Arrays;

public class Director {
    private final BuilderInterface builder;

    public Director(BuilderInterface builder) {
        this.builder = builder;
    }

    public Car constructSportsCar() {
        builder.setCarType(Cartype.SPORT);
        builder.setEngine(new Engine(4.0, 480));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setExtras(new Extras(Arrays.asList("GPS", "Xenon")));
        builder.setSeats(2);
        builder.setWheels(22);
        return builder.getCar();
    }

    public Car constructCityCar() {
        builder.setCarType(Cartype.CITY);
        builder.setEngine(new Engine(1.2, 80));
        builder.setTransmission(Transmission.MANUAL);
        builder.setExtras(new Extras(Arrays.asList("Start/Stop")));
        builder.setSeats(5);
        builder.setWheels(16);
        return builder.getCar();
    }
}