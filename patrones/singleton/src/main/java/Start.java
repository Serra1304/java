public class Start {

    public static void main(String[] args) {

        //Comprobacion del patron sigleton
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        System.out.println("Primera instancia singleton: " + firstSingleton);
        System.out.println("Segunda instancia singleton: " + secondSingleton);
        System.out.println("¿Son la misma instancia?: " + firstSingleton.equals(secondSingleton));


        //Comprobacion del patron singleton con multihilo
        Thread threadFoo = new Thread(new ThreadFirst());
        Thread threadBar = new Thread(new ThreadSecond());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFirst implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Instancia en el primer hilo: " + singleton);
        }
    }

    static class ThreadSecond implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Instancia en el segundo hilo: " + singleton);
        }
    }
}
