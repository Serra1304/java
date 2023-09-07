public class Main {
    public static  void main(String[] args) {
        Mobile mobile = new Mobile();
        Tv tv = new Tv();
        PcAdapter pc = new PcAdapter();

        connect(mobile);
        connect(pc);

        System.out.println("¿El movil esta encendido?: " + isConnected(mobile));
        System.out.println("¿La television esta encendida?: " + isConnected(tv));
        System.out.println("¿El pc esta encendido?: " + isConnected(pc));
    }

    public static void connect(Pluggable pluggable) {
        pluggable.connect();
    }

    public static boolean isConnected(Pluggable pluggable) {
        return pluggable.isConnected();
    }
}
