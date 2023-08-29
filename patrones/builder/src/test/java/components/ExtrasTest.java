package components;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtrasTest {
    @Test
    public void testExtrasCreation() {
        String extra1 = "Bluetooth";
        String extra2 = "GPS";
        String extra3 = "Climatizador";

        Extras extras = new Extras(Arrays.asList(extra1, extra2, extra3));

        assertEquals(Arrays.asList(extra1, extra2, extra3), extras.getExtras());
    }

    @Test
    public void testExtrasAdded() {
        String extra1 = "Bluetooth";
        String extra2 = "GPS";
        String extra3 = "Climatizador";
        String extra4 = "Xenon";

        Extras extras = new Extras(Arrays.asList(extra1, extra2, extra3));
        extras.addExtras(extra4);

        assertEquals(Arrays.asList(extra1, extra2, extra3, extra4), extras.getExtras());
    }
}
