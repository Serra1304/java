/*
 * Clase auxiliar para pruebas unitarias, la cual verifica que solo se crea una instancia del objeto
 * Singleton en una ejecucion multihilo.
 */

public class SingletonCreationCounter {
    private static int creationCount = 0;

    // Método para incrementar el contador de creación
    public static synchronized void incrementCreationCount() {
        creationCount++;
    }

    // Método para obtener el contador de creación
    public static synchronized int getCreationCount() {
        return creationCount;
    }
}