public class Sepeda {
    int gear;
    int jumlahRoda;
    String jenis;
    String merk;

    public Sepeda(int jumlahRoda, String jenis, String merk) {
        this.jumlahRoda = jumlahRoda;
        this.jenis = jenis;
        this.merk = merk;
        System.out.println("Sepeda " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }

    void ngerem() {
        System.out.println("Sepeda direm");
    }
}