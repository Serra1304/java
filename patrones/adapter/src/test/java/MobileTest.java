import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MobileTest {

    private static Mobile mobile;

    @BeforeAll
    public static void setUp() {
        mobile = new Mobile();
    }

    @Test
    public void testConnect() {
        assertFalse(mobile.isConnected());

        mobile.connect();
        assertTrue(mobile.isConnected());
    }

    @Test
    public void testDisconnect() {
        mobile.connect();
        assertTrue(mobile.isConnected());

        mobile.disconnect();
        assertFalse(mobile.isConnected());
    }
}
