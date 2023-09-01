package director;

import builder.BuilderInterface;
import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;

import java.util.Arrays;

/**
 * La clase Director se utiliza para construir objetos Car con configuraciones predefinidas
 * utilizando un objeto BuilderInterface personalizado.
 */
public class Director {
    private final BuilderInterface builder;

    /**
     * Constructor que toma una instancia de la interface BuilderInterface.
     *
     * @param builder El constructor de interfaz utilizado para construir objetos Car.
     */
    public Director(BuilderInterface builder) {
        this.builder = builder;
    }

    /**
     * Construccion de un coche deportivo preconfigurado.
     *
     * @return Un objeto Car configurado como un coche deportivo.
     */
    public Car constructSportsCar() {
        builder.carType(Cartype.SPORT)
                .engine(new Engine(4.0, 480))
                .transmission(Transmission.AUTOMATIC)
                .extras(new Extras(Arrays.asList("GPS", "Xenon")))
                .seats(2)
                .wheels(22)
                .build();
        return builder.getCar();
    }

    /**
     * Construccion de un coche ciudad preconfigurado.
     *
     * @return Un objeto Car configurado como un coche ciudad.
     */
    public Car constructCityCar() {
        builder.carType(Cartype.CITY)
                .engine(new Engine(1.2, 80))
                .transmission(Transmission.MANUAL)
                .extras(new Extras(Arrays.asList("Start/Stop", "Bluetooth")))
                .seats(5)
                .wheels(16)
                .build();
        return builder.getCar();
    }
}