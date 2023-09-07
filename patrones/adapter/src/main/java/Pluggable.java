/**
 * La interfaz Pluggable define un conjunto de métodos que deben ser implementados
 * por cualquier clase que represente un dispositivo que se puede conectar y desconectar.
 */
public interface Pluggable {
    /**
     * Conecta el dispositivo.
     */
    void connect();

    /**
     * Desconecta el dispositivo.
     */
    void disconnect();

    /**
     * Verifica si el dispositivo se encuentra actualmente conectado.
     * @return True si el dispositivo se encuentra conectado o false, por lo contrario.
     */
    boolean isConnected();
}
