public class Main {
    public static void main(String[] args) {

        //Clonacion de la clase CarClonManual
        CarClonManual carManual = new CarClonManual();
        carManual.setBrand("Audi");
        carManual.setModel("Q5");
        carManual.setEngine(3.0);
        carManual.setPower(270);

        CarClonManual carManualClon = carManual.clon();

        System.out.println(carManual.getBrand() + "  " +
                carManual.getModel() + "  " +
                carManual.getEngine() + "  " +
                carManual.getPower());
        System.out.println(carManualClon.getBrand() + "  " +
                carManualClon.getModel() + "  " +
                carManualClon.getEngine() + "  " +
                carManualClon.getPower());


        //Clonacion de la clase CarClonInterface a travez de la interfaz cloneable
        CarClonInterface car = new CarClonInterface();
        car.setBrand("Audi");
        car.setModel("A4");
        car.setEngine(2.0);
        car.setPower(150);

        try {
            CarClonInterface carClon  = car.clon();

            System.out.println(car.getBrand() + "  " +
                    car.getModel() + "  " +
                    car.getEngine() + "  " +
                    car.getPower());
            System.out.println(carClon.getBrand() + "  " +
                    carClon.getModel() + "  " +
                    carClon.getEngine() + "  " +
                    carClon.getPower());
        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo clonar el coche");
            throw new RuntimeException(e);
        }
    }
}
