package components;

/**
 * La enumeración Transmission representa los diferentes tipos de transmisiones disponibles para un automóvil.
 * Cada tipo de transmisión tiene una descripción asociada.
 */
public enum Transmission {
    /**
     * Transmision de velocidad unica.
     */
    SINGLE_SPEED("Sin caga de cambio"),

    /**
     * Transmision manual.
     */
    MANUAL("Manual"),

    /**
     * Transmision semiautomatica.
     */
    SEMI_AUTOMATIC("Semiautomatico"),

    /**
     * Transmision automatica.
     */
    AUTOMATIC("Automatico");

    private final String transmimssion;

    /**
     * Constructor de la enumeracion Transmission.
     *
     * @param transmimssion Tipo de transmision.
     */
    Transmission(String transmimssion) {
        this.transmimssion = transmimssion;
    }

    /**
     * Obtiene el tipo de transmision.
     * @return el tipo de transmision.
     */
    public String getTransmimssion() {
        return transmimssion;
    }
}
