public class Main {

    public static void main(String[] args) {
        //Cafe simple
        System.out.println("Cafe basico");
        BasicCoffee coffe = new BasicCoffee();
        System.out.println("Descripcion: " + coffe.description());
        System.out.println("Precio: " + coffe.price() + "€");

        //Cafe con leche
        System.out.println("====================");
        System.out.println("Cafe con leche");
        Milk coffeMilk = new Milk(new BasicCoffee());
        System.out.println("Descripcion: " + coffeMilk.description());
        System.out.println("Precio: " + coffeMilk.price() + "€");

        //Cafe con leche y azucar
        System.out.println("====================");
        System.out.println("Cafe con leche y azucar");
        Sugar coffeMilkSugar = new Sugar(new Milk(new BasicCoffee()));
        System.out.println("Descripcion: " + coffeMilkSugar.description());
        System.out.println("Precio: " + coffeMilkSugar.price() + "€");
    }
}
