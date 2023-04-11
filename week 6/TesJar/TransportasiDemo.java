import Transportasi.*;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Lamborgini", "Emas", 80);
        Bicycle sepeda = new Bicycle("Aviator", "putih", 20);

        mobil.maju();
        sepeda.maju();
    }
}
