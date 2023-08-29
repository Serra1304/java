package components;

import java.util.ArrayList;
import java.util.List;

public class Extras {

    private List<String> extras;

    public Extras(List<String> extras){
        this.extras = new ArrayList<>(extras);
    }

    public void addExtras(String extra) {
        this.extras.add(extra);
    }

    public List<String> getExtras() {

        return new ArrayList<>(extras);
    }
}
