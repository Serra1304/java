/**
 * Esta clase representa el estado en el cual puede estar un objeto televisor,
 * siendo este conectado o desconectado.
 */
public class Tv implements Pluggable {
    private boolean connected = false;

    /**
     * Conecta el televisor.
     */
    @Override
    public void connect() {
        connected = true;
    }

    /**
     * Desconecta el televisor.
     */
    @Override
    public void disconnect() {
        connected = false;
    }

    /**
     * Obtiene el estado de la conexion del televisor.
     * @return True si el televisor está conectado o false, por lo contrario.
     */
    @Override
    public boolean isConnected() {
        return connected;
    }
}
