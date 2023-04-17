public class Main {
    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap("Dewandra", 1000000, 5000000);
        int totalGajiTetap = karyawanTetap.totalGaji(); 
        System.out.println("Total gaji karyawan tetap " + karyawanTetap.getNama() + " adalah " + totalGajiTetap);

        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("Mankyau", 500000, 150000, 20);
        int totalUpahKontrak = karyawanKontrak.totalUpah(); 
        System.out.println("Total upah karyawan kontrak " + karyawanKontrak.getNama() + " adalah " + totalUpahKontrak);
    }
}
