/**
 * Esta clase representa el estado en el cual puede estar un objeto mobile,
 * siendo este conectado o desconectado.
 */
public class Mobile implements Pluggable {
    private boolean connected =  false;

    /**
     * Conecta el movil.
     */
    @Override
    public void connect() {
        connected = true;
    }

    /**
     * Desconecta el movil.
     */
    @Override
    public void disconnect() {
        connected = false;
    }

    /**
     * Verifica si el movil se encuentra actualmente conectada.
     * @return True si el movil se encuentra conectado o false, por lo contrario.
     */
    @Override
    public boolean isConnected() {
        return connected;
    }
}
