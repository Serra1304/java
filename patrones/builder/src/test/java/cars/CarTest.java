package cars;

import components.Engine;
import components.Extras;
import components.Transmission;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void testCarConfiguration() {
        Cartype cartype = Cartype.CITY;
        Engine engine = new Engine(2.1, 250);
        Transmission transmission = Transmission.AUTOMATIC;
        Extras extras = new Extras(Arrays.asList("GPS", "Xenon"));
        int seats = 3;
        int wheels = 17;

        Car car = new Car(cartype, engine, transmission, extras, seats, wheels);

        assertEquals(cartype, car.getCartype());
        assertEquals(engine, car.getEngine());
        assertEquals(transmission, car.getTransmission());
        assertEquals(extras, car.getExtras());
        assertEquals(seats, car.getSeats());
        assertEquals(wheels, car.getWheels());
    }

    @Test
    public void testCarModification() {
        //Configuration init
        Cartype carType = Cartype.CITY;
        Engine engine = new Engine(2.1, 250);
        Transmission transmission = Transmission.MANUAL;
        Extras extras = new Extras(Arrays.asList("GPS", "Xenon"));
        int seats = 5;
        int wheels = 17;

        Car car = new Car(carType, engine, transmission, extras, seats, wheels);

        //Configuration modified
        Cartype carTypeMod = Cartype.SPORT;
        Engine engineMod = new Engine(5.7, 670);
        Transmission transmissionMod = Transmission.AUTOMATIC;
        Extras extrasMod = new Extras(Arrays.asList("Bluetooth", "Climatizador"));
        int seatsMod = 2;
        int wheelsMod = 22;

        car.setCartype(carTypeMod);
        car.setEngine(engineMod);
        car.setTransmission(transmissionMod);
        car.setExtras(extrasMod);
        car.setSeats(seatsMod);
        car.setWheels(wheelsMod);

        assertEquals(carTypeMod, car.getCartype());
        assertEquals(engineMod, car.getEngine());
        assertEquals(transmissionMod, car.getTransmission());
        assertEquals(extrasMod, car.getExtras());
        assertEquals(seatsMod, car.getSeats());
        assertEquals(wheelsMod,car.getWheels());
    }
}
