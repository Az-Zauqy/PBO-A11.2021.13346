import java.util.Scanner;

public class Kondisional {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String nim, nama;
        float tugas, uts, uas;

        boolean ulang;
        do {
            System.out.print("NIM : ");
            nim = inp.nextLine();

            System.out.print("Nama : ");
            nama = inp.nextLine();

            System.out.print("Nilai tugas : ");
            tugas = inp.nextFloat();

            System.out.print("Nilai UTS : ");
            uts = inp.nextFloat();

            System.out.print("Nilai UAS : ");
            uas = inp.nextFloat();

            float nilaiAkhir = (tugas * 0.2f) + (uts * 0.35f) + (uas * 0.45f);

            Nilai nl = new Nilai();
            char huruf = nl.getNilHuruf(nilaiAkhir);
            String predikat = nl.getPredikat(huruf);

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("Predikat : " + predikat);

            System.out.print("Input data lagi [Y/T]? ");
            inp.nextLine(); // consume newline character
            String jawaban = inp.nextLine();
            ulang = jawaban.equalsIgnoreCase("Y");
        } while (ulang);
    }
}
