package builder;

import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;

/**
 * La interfaz BuilderInterface define los métodos necesarios para construir un objeto de tipo Car de manera incremental.
 * Los métodos permiten configurar diferentes aspectos del coche, como el tipo, el motor, los extras, la transmisión,
 * el número de asientos y ruedas, y finalmente construir el objeto Car completo.
 */
public interface BuilderInterface {
    /**
     * Establece el tipo de coche.
     *
     * @param cartype El tipo de coche.
     * @return La instancia actual del BuilderInterface con el tipo de automóvil configurado.
     */
    BuilderInterface carType(Cartype cartype);
    /**
     * Establece el motor del coche.
     *
     * @param engine El motor del coche.
     * @return La instancia actual del BuilderInterface con el tipo de automóvil configurado.
     */
    BuilderInterface engine(Engine engine);
    /**
     * Establece los extras del coche.
     *
     * @param extras Los extras del coche.
     * @return La instancia actual del BuilderInterface con el tipo de automóvil configurado.
     */
    BuilderInterface extras(Extras extras);
    /**
     * Establece la transmision del coche.
     *
     * @param transmission La transmision del coche.
     * @return La instancia actual del BuilderInterface con el tipo de automóvil configurado.
     */
    BuilderInterface transmission(Transmission transmission);
    /**
     * Establece el número de asientos del coche.
     *
     * @param seats El número de asientos del coche.
     * @return La instancia actual del BuilderInterface con el tipo de automóvil configurado.
     */
    BuilderInterface seats(int seats);
    /**
     * Establece el tamaño de las ruedas del coche.
     *
     * @param wheels El tamaño de las ruedas del coche.
     * @return La instancia actual del BuilderInterface con el tipo de automóvil configurado.
     */
    BuilderInterface wheels(int wheels);
    /**
     * Construye y devuelve un objeto Car completo con la configuración actual.
     *
     * @return Un objeto Car construido con la configuración especificada.
     */
    Car build();
    /**
     * Obtiene el objeto Car.
     *
     * @return El objeto Car.
     */
    Car getCar();
}
