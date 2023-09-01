package components;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Extras representa los extras que se pueden añadir a un coche.
 * Permite agregar y obtener una lista de extras configurados.
 */
public class Extras {

    private List<String> extras;

    /**
     * Constructor que inicializa la lista de extras del coche con la lista proporcionada.
     *
     * @param extras Listas de extras del coche.
     */
    public Extras(List<String> extras){
        this.extras = new ArrayList<>(extras);
    }

    /**
     * Añade un nuevo extra a la lista ya existente.
     *
     * @param extra Extra a añadir a la lista.
     */
    public void addExtras(String extra) {
        this.extras.add(extra);
    }

    /**
     * Obtiene una lista con los extras del coche.
     *
     * @return Lista de los extras del coche.
     */
    public List<String> getExtras() {

        return new ArrayList<>(extras);
    }
}
