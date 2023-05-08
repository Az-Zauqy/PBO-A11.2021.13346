import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        int pilihan = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa Baru");
            System.out.println("2. Tambah Mahasiswa Transfer");
            System.out.println("3. Tambah Mahasiswa Lulus");
            System.out.println("4. Tampilkan Informasi Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Semester: ");
                    int semester = input.nextInt();
                    System.out.print("Usia: ");
                    int usia = input.nextInt();
                    input.nextLine(); // menghindari bug scanner
                    System.out.print("Asal Sekolah: ");
                    String asalSekolah = input.nextLine();
                    MahasiswaBaru mb = new MahasiswaBaru(nim, nama, semester, usia, args, null, asalSekolah);
                    listMahasiswa.add(mb);
                    break;
                case 2:
                    System.out.print("NIM: ");
                    nim = input.nextLine();
                    System.out.print("Nama: ");
                    nama = input.nextLine();
                    System.out.print("Semester: ");
                    semester = input.nextInt();
                    System.out.print("Usia: ");
                    usia = input.nextInt();
                    input.nextLine(); // menghindari bug scanner
                    System.out.print("Asal Universitas: ");
                    String asalUniv = input.nextLine();
                    MahasiswaTransfer mt = new MahasiswaTransfer(nim, nama, semester, usia, args, null, asalUniv, nim);
                    listMahasiswa.add(mt);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    nim = input.nextLine();
                    System.out.print("Nama: ");
                    nama = input.nextLine();
                    System.out.print("Semester: ");
                    semester = input.nextInt();
                    System.out.print("Usia: ");
                    usia = input.nextInt();
                    input.nextLine(); // menghindari bug scanner
                    System.out.print("Tahun Wisuda: ");
                    int tahun = input.nextInt();
                    System.out.print("IPK: ");
                    float ipk = input.nextFloat();
                    MahasiswaLulus ml = new MahasiswaLulus(nim, nama, semester, usia, args, null, tahun, ipk);
                    listMahasiswa.add(ml);
                    break;
                case 4:
                    for (Mahasiswa m : listMahasiswa) {
                        m.infoMahasiswa();
                        System.out.println("---------------------------");
                    }
                    System.out.println("Rata-rata nilai mahasiswa: " + hitungRataNilai(listMahasiswa));
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 5);
    }

    private static float hitungRataNilai(ArrayList<Mahasiswa> listMahasiswa) {
        float total = 0;
        int count = 0;

        for (Mahasiswa m : listMahasiswa) {
            if (m instanceof MahasiswaLulus) {
                total += ((MahasiswaLulus) m).getIpk();
                count++;
            }
        }
    
        if (count == 0) {
            return 0;
        } else {
            return total / count;
        }
    }
}
