import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TvTest {
    private static Tv Tv;

    @BeforeAll
    public static void setUp() {
        Tv = new Tv();
    }

    @Test
    public void testConnect() {
        assertFalse(Tv.isConnected());

        Tv.connect();
        assertTrue(Tv.isConnected());
    }

    @Test
    public void testDisconnect() {
        Tv.connect();
        assertTrue(Tv.isConnected());

        Tv.disconnect();
        assertFalse(Tv.isConnected());
    }
}
