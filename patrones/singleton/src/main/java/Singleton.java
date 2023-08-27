public class Singleton {
    private static Singleton instance;

    //Constructor privado que evita la creacion directa de la instancia
    private Singleton(){
        SingletonCreationCounter.incrementCreationCount(); //Llamada a la clase auxiliar para indicar el número de instancias creadas
    }

    //Metodo para obtener la instancia unica.
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /*
    Resto de metodos de la clase
     */
}
