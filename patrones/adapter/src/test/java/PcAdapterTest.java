import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PcAdapterTest {
    private static PcAdapter pcAdapter;

    @BeforeAll
    public static void setUp() {
        pcAdapter = new PcAdapter();
    }

    @Test
    public void testConnect() {
        assertFalse(pcAdapter.isConnected());

        pcAdapter.connect();
        assertTrue(pcAdapter.isConnected());
    }

    @Test
    public void testDisconnect() {
        pcAdapter.connect();
        assertTrue(pcAdapter.isConnected());

        pcAdapter.disconnect();
        assertFalse(pcAdapter.isConnected());
    }
}
