public class Waktu {
    int detik;
    int menit;
    int jam;

    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public static void main(String[] args) {
        // membuat objek dari class Waktu
        Waktu mulai = new Waktu(8, 12, 15);
        Waktu selesai = new Waktu(12, 34, 55);
        Waktu selisih;

        // memanggil method perbedaan
        selisih = perbedaan(mulai, selesai);

        System.out.printf("Selisih Waktu: %d:%d:%d - %d:%d:%d = %d:%d:%d\n", selesai.jam, selesai.menit, selesai.detik,
                mulai.jam, mulai.menit, mulai.detik, selisih.jam, selisih.menit, selisih.detik);
    }

    public static Waktu perbedaan(Waktu mulai, Waktu selesai) {
        Waktu selisih = new Waktu(0, 0, 0);

        if (mulai.detik > selesai.detik) {
            --selesai.menit;
            selesai.detik += 60;
        }

        selisih.detik = selesai.detik - mulai.detik;

        if (mulai.menit > selesai.menit) {
            --selesai.jam;
            selesai.menit += 60;
        }

        selisih.menit = selesai.menit - mulai.menit;
        selisih.jam = selesai.jam - mulai.jam;

        return (selisih);
    }
}