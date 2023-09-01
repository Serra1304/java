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

        when(mockBuilder.carType(Cartype.SPORT)).thenReturn(mockBuilder);
        when(mockBuilder.engine(any(Engine.class))).thenReturn(mockBuilder);
        when(mockBuilder.transmission(Transmission.AUTOMATIC)).thenReturn(mockBuilder);
        when(mockBuilder.extras(any(Extras.class))).thenReturn(mockBuilder);
        when(mockBuilder.seats(2)).thenReturn(mockBuilder);
        when(mockBuilder.wheels(22)).thenReturn(mockBuilder);
        when(mockBuilder.getCar()).thenReturn(expectedCar);

        Car constructedCar = director.constructSportsCar();

        assertEquals(expectedCar, constructedCar);
        verify(mockBuilder, times(1)).carType(Cartype.SPORT);
        verify(mockBuilder, times(1)).engine(any(Engine.class));
        verify(mockBuilder, times(1)).transmission(Transmission.AUTOMATIC);
        verify(mockBuilder, times(1)).extras(any(Extras.class));
        verify(mockBuilder, times(1)).seats(2);
        verify(mockBuilder, times(1)).wheels(22);
        verify(mockBuilder, times(1)).getCar();
        verifyNoMoreInteractions(mockBuilder);
    }
}
