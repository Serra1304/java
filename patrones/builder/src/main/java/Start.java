import builder.BuilderInterface;
import builder.CarBuilder;
import cars.Car;
import director.Director;

public class Start {

    public static void main(String[] args){
            BuilderInterface builder = new CarBuilder();
            Director director = new Director(builder);

            Car sportsCar = director.constructSportsCar();
            sportsCar.listConfiguration();

            System.out.println();

            Car cityCar = director.constructCityCar();
            cityCar.listConfiguration();
    }
}
