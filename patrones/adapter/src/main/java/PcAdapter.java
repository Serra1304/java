import externalCode.Pc;

/**
 * La clase PcAdapter implementa la interfaz Pluggable y actúa como un adaptador
 * para la clase Pc, permitiendo que un objeto de tipo Pc sea utilizado como un dispositivo
 * Pluggable, es decir, que se pueda conectar y desconectar de una fuente de energía.
 */
public class PcAdapter implements Pluggable{
    private Pc pc = new Pc();

    /**
     * Conecta la PC al suministro de energía proporcionando un voltaje de 230 voltios.
     */
    @Override
    public void connect() {
        pc.powerOn(230);
    }

    /**
     * Desconecta la pc del suministro de energia.
     */
    @Override
    public void disconnect() {
        pc.powerOff();
    }

    /**
     * Verifica si la pc se encuentra actualmente conectada.
     * @return True si la pc se encuentra conectado o false, por lo contrario.
     */
    @Override
    public boolean isConnected() {
        return pc.isPowered();
    }
}
