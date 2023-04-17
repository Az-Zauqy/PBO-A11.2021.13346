public class KaryawanKontrak extends Karyawan {
    private int upahHarian;
    private int jumlahHari;

    public KaryawanKontrak(String nama, int tunjanganAnak, int upahHarian, int jumlahHari) {
        super(nama, tunjanganAnak);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    public int totalUpah() {
        return upahHarian * jumlahHari + getTunjanganAnak();
    }
}