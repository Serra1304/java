import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarClonInterfaceTest {
    @Test
    public void testCarClonInterface() {
        String brand = "BMW";
        String model = "S3";
        double engine = 2.0;
        double power = 150;

        CarClonInterface car = new CarClonInterface();
        car.setBrand(brand);
        car.setModel(model);
        car.setEngine(engine);
        car.setPower(power);

        try {
            CarClonInterface carClon = car.clon();

            assertEquals(carClon.getBrand(), car.getBrand());
            assertEquals(carClon.getModel(), car.getModel());
            assertEquals(carClon.getEngine(), car.getEngine());
            assertEquals(carClon.getPower(), car.getPower());
        } catch (CloneNotSupportedException e) {
            System.out.println("Se produjo un error en la clonacion");
        }
    }

    @Test
    public void testGettersAndSetters() {
        CarClonInterface car = new CarClonInterface();
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
