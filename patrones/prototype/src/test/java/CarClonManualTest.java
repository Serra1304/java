import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarClonManualTest {
    @Test
    public void testCarClonInterface() {
        String brand = "BMW";
        String model = "S3";
        double engine = 2.0;
        double power = 150;

        CarClonManual car = new CarClonManual();
        car.setBrand(brand);
        car.setModel(model);
        car.setEngine(engine);
        car.setPower(power);

        CarClonManual carClon = car.clon();

        assertEquals(carClon.getBrand(), car.getBrand());
        assertEquals(carClon.getModel(), car.getModel());
        assertEquals(carClon.getEngine(), car.getEngine());
        assertEquals(carClon.getPower(), car.getPower());
    }

    @Test
    public void testGettersAndSetters() {
        CarClonManual car = new CarClonManual();
        car.setBrand("Ford");
        car.setModel("Mustang");
        car.setEngine(5.0);
        car.setPower(450.0);

        assertEquals("Ford", car.getBrand());
        assertEquals("Mustang", car.getModel());
        assertEquals(5.0, car.getEngine(), 0.001);
        assertEquals(450.0, car.getPower(), 0.001);
    }
}
