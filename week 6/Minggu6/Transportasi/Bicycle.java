package Transportasi;

public class Bicycle {
    private String merek;
    private String warna;
    private int kecepatan;

    public Bicycle(String merek, String warna, int kecepatan) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public String getMerek() {
        return merek;
    }

    public String getWarna() {
        return warna;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void maju() {
        System.out.println("Sepeda " + merek + " berwarna " + warna + " melaju dengan kecepatan " + kecepatan + " km/h.");
    }

}
