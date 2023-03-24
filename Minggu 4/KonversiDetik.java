import java.util.Scanner;

public class KonversiDetik {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Meminta input detik dari user
      System.out.print("Masukkan jumlah detik: ");
      int detik = input.nextInt();

      // Menghitung jumlah hari, jam, menit, dan detik
      int hari = detik / 86400;
      detik %= 86400;
      int jam = detik / 3600;
      detik %= 3600;
      int menit = detik / 60;
      detik %= 60;

      // Menampilkan hasil konversi
      System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
   }
}