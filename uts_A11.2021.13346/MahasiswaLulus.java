public class MahasiswaLulus extends Mahasiswa {
    private int tahunWisuda;
    private float ipk;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int[]nilai, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs, nilai);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    public boolean ikutWisuda() {
        // implementasi ikutWisuda
        return true;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }

    public float getIpk() {
        return 0;
    }
}
