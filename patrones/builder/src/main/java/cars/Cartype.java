package cars;

/**
 * La enumeración Cartype define los diferentes tipos de automóviles disponibles.
 * Cada tipo de automóvil tiene una descripción asociada.
 */
public enum Cartype {
    /**
     * Coche ciudad.
     */
    CITY("Ciudad"),

    /**
     * Coche deportivo.
     */
    SPORT("Deportivo"),

    /**
     * Coche todocamino
     */
    SUV("Todo camino"),

    /**
     * Coche electrico
     */
    ELECTRIC("Eléctrico");

    private final String type;

    /**
     * Constructor del tipo de coche.
     *
     * @param type Escripcion del tipo de coche.
     */
    Cartype(String type) {
        this.type = type;
    }

    /**
     * Obtiene el tipo de coche.
     *
     * @return El tipo de coche.
     */
    public String getType() {
        return type;
    }
}
