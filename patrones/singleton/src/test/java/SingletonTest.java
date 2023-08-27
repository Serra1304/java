import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonTest {

    //Test basisco para patron Singleton
    @Test
    public void testGetInstance() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        assertEquals(firstInstance, secondInstance, "No son la misma instancia");
    }

    //Test basico para la ejecucion multihilo del patron singleton
    @Test
    public void testSingletonMultithreadedAccess() throws InterruptedException {
        final int numThreads = 10;
        final int numIterationsPerThread = 100;

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        Runnable task = () -> {
            for (int i = 0; i < numIterationsPerThread; i++) {
                Singleton instance = Singleton.getInstance();
            }
        };

        //Iniciacion de varios subproceso para acceder simultaneamente a la instancia Singleton
        for (int i = 0; i < numThreads; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        //Comprobacino de que solo se creo una instancia
        assertEquals(1, SingletonCreationCounter.getCreationCount());
    }
}
