public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;

    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, int[]nilai, String asalSekolah) {
        super(nim, nama, semester, usia, krs, nilai);
        this.asalSekolah = asalSekolah;
    }

    public boolean ikutOspek() {
        // implementasi ikutOspek
        return true;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
}