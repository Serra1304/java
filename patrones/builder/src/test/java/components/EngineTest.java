package components;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngineTest {
    @Test
    public void testEngineCreation() {
        double volume = 3.6;
        int power = 233;

        Engine engine = new Engine(volume, power);

        assertEquals(volume, engine.volume());
        assertEquals(power, engine.power());
    }

    @Test
    public void testEngineEquality() {
        Engine engine1 = new Engine(2.0, 150);
        Engine engine2 = new Engine(2.0, 150);

        assertEquals(engine1, engine2);
    }
}
