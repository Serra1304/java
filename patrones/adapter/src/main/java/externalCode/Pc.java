package externalCode;

/**
 * La clase Pc representa un objeto que simula el estado de una computadora.
 * Puede encenderse o apagarse, y se verifica si está alimentada con suficiente
 * voltaje para estar encendida.
 *
 * Esta clase simula una libreria externa, desfasada, a la cual no podemos modificar
 * su código y no cumple los estandares de nuestra aplicacion, por lo tanto, habría
 * que aplicar el patron adapter.
 */
public class Pc {
    private int voltage = 0;
    private boolean isPowered = false;

    /**
     * Enciende la pc si el voltage proporcionado es el suficiente.
     *
     * @param voltage El voltage proporcionado al pc.
     * @return True si el voltaje es el suficiente para encender la pc, por lo contrario, devuelve false.
     */
    public boolean powerOn(int voltage) {
        this.voltage = voltage;

        isPowered = voltage > 210;
        return isPowered;
    }

    /**
     * Apaga la pc y establece el voltage 0.
     */
    public void powerOff() {
        voltage = 0;
        isPowered = false;
    }

    /**
     * Verifica el estado de la pc.
     * @return True si la pc esta encendida, sino devuelve false.
     */
    public boolean isPowered() {
        return isPowered;
    }

    /**
     * Obtiene el voltaje que alimenta la pc.
     * @return El voltaje que alimenta la pc.
     */
    public int getVoltage() {
        return voltage;
    }
}