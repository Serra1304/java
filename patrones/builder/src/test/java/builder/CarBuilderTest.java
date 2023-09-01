package builder;

import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarBuilderTest {
    @Test
    public void testBuildCar() {
        BuilderInterface builder = new CarBuilder();

        Cartype cartype = Cartype.SPORT;
        Engine engine = new Engine(2.0, 200);
        Extras extras = new Extras(Arrays.asList("GPS", "Xenon"));
        Transmission transmission = Transmission.AUTOMATIC;
        int seats = 2;
        int wheels = 24;

        builder.carType(cartype);
        builder.engine(engine);
        builder.extras(extras);
        builder.transmission(transmission);
        builder.seats(seats);
        builder.wheels(wheels);

        Car car = builder.getCar();

        assertNotNull(car);
        assertEquals(cartype, car.getCartype());
        assertEquals(engine, car.getEngine());
        assertEquals(extras, car.getExtras());
        assertEquals(transmission, car.getTransmission());
        assertEquals(seats, car.getSeats());
        assertEquals(wheels, car.getWheels());
    }
}
