public class MahasiswaTransfer extends MahasiswaBaru {

    private String asalUniversitas;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, int[] nilai, String asalSekolah , String asalUniversitas) {
        super(nim, nama, semester, usia, krs, nilai, asalSekolah);
        this.asalUniversitas = asalUniversitas;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas: " + asalUniversitas);
    }
}
