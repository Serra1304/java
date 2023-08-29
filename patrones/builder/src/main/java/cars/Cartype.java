package cars;

public enum Cartype {
    CITY("Ciudad"),
    SPORT("Deportivo"),
    SUV("Todo camino"),
    ELECTRIC("Eléctrico");

    private final String type;

    Cartype(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
