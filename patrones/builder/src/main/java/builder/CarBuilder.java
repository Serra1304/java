package builder;

import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;

/**
 * La clase CarBuilder implementa la interfaz BuilderInterface y se utiliza para construir objetos Car de manera incremental.
 * Permite configurar diferentes aspectos de un coche y luego construir el objeto Car completo con la configuración deseada.
 */
public class CarBuilder implements BuilderInterface{
    private final Car car = new Car();

    /**
     * Establece el tipo de coche para la construcción.
     *
     * @param cartype El tipo de coche.
     * @return La instancia actual del CarBuilder con el tipo de coche configurado.
     */
    @Override
    public BuilderInterface carType(Cartype cartype){
        car.setCartype(cartype);
        return this;
    }

    /**
     * Establece el motor del coche para la construcción.
     *
     * @param engine El motor del coche.
     * @return La instancia actual del CarBuilder con el tipo de coche configurado.
     */
    @Override
    public BuilderInterface engine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    /**
     * Establece los extras del coche para la construcción.
     *
     * @param extras Los extras del coche.
     * @return La instancia actual del CarBuilder con el tipo de coche configurado.
     */
    @Override
    public BuilderInterface extras(Extras extras) {
        car.setExtras(extras);
        return this;
    }

    /**
     * Establece la transmision del coche para la construcción.
     *
     * @param transmission El motor del coche.
     * @return La instancia actual del CarBuilder con el tipo de coche configurado.
     */
    @Override
    public BuilderInterface transmission(Transmission transmission) {
        car.setTransmission(transmission);
        return this;
    }

    /**
     * Establece el número de asientos del coche para la construcción.
     *
     * @param seats El número de asientos del coche.
     * @return La instancia actual del CarBuilder con el tipo de coche configurado.
     */
    @Override
    public BuilderInterface seats(int seats) {
        car.setSeats(seats);
        return this;
    }

    /**
     * Establece el tamaño de la rueda del coche para la construcción.
     *
     * @param wheels El tamaño de la rueda del coche.
     * @return La instancia actual del CarBuilder con el tipo de coche configurado.
     */
    @Override
    public BuilderInterface wheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }

    /**
     * Construye y devuelve un objeto Car completo con la configuración actual.
     *
     * @return El objeto Car construido con la configuración especificada.
     */
    @Override
    public Car build() {
        return car;
    }

    /**
     * Obtiene el objeto Car.
     *
     * @return El objeto Car.
     */
    @Override
    public Car getCar() {
        return car;
    }
}
