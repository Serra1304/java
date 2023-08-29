package director;

import builder.BuilderInterface;
import cars.Car;
import cars.Cartype;
import components.Engine;
import components.Extras;
import components.Transmission;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DirectorTest {
    @Test
    public void testConstructSportsCar() {
        BuilderInterface mockBuilder = mock(BuilderInterface.class);
        Director director = new Director(mockBuilder);

        Car expectedCar = new Car(Cartype.SPORT, new Engine(4.0, 480),
                Transmission.AUTOMATIC, new Extras(Arrays.asList("GPS", "Xenon")), 2, 22);

        when(mockBuilder.getCar()).thenReturn(expectedCar);

        Car constructedCar = director.constructSportsCar();

        assertEquals(expectedCar, constructedCar);
        verify(mockBuilder, times(1)).setCarType(Cartype.SPORT);
        verify(mockBuilder, times(1)).setEngine(any(Engine.class));
        verify(mockBuilder, times(1)).setTransmission(Transmission.AUTOMATIC);
        verify(mockBuilder, times(1)).setExtras(any(Extras.class));
        verify(mockBuilder, times(1)).setSeats(2);
        verify(mockBuilder, times(1)).setWheels(22);
        verify(mockBuilder, times(1)).getCar();
        verifyNoMoreInteractions(mockBuilder);
    }
}
