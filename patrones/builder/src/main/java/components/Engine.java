package components;

public record Engine(double volume, int power) {

}


//Forma tradicional para Java < 16
/*
public class Engine {

    private final double volume;
    private final int power;

    public Engine(double volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }
}
*/