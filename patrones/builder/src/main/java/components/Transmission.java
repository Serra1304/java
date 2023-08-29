package components;

public enum Transmission {
    SINGLE_SPEED("Sin caga de cambio"),
    MANUAL("Manual"),
    SEMI_AUTOMATIC("Semiautomatico"),
    AUTOMATIC("Automatico");

    private final String transmimssion;

    Transmission(String transmimssion) {
        this.transmimssion = transmimssion;
    }

    public String getTransmimssion() {
        return transmimssion;
    }
}
