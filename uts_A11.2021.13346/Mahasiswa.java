public class Mahasiswa {
    private String nim;
    private String nama;
    private int semester;
    private int usia;
    private String[] krs;
    private int[] nilai;

    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs, int[] nilai) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.nilai = nilai;
    }

    public void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
    }

    public void infoKrsMahasiswa() {
        System.out.println("KRS:");
        for (int i = 0; i < krs.length; i++) {
            System.out.println("- " + krs[i]);
        }
    }

    public float hitungRataNilai() {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return (float) total / nilai.length;
    }

    public int getJumlahMataKuliah() {
        return 0;
    }
}
