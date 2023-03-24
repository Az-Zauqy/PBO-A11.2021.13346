import java.util.Scanner;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public float getTotalPembelian() {
        return harga * jumlah;
    }
    
    public String getBonus() {
        float totalPembelian = getTotalPembelian();
        String bonus = "";
        
        if (totalPembelian >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            bonus = "Ballpoint";
        }
        
        return bonus;
    }
    
    public void cetakNota() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputLagi = true;
        
        while (inputLagi) {
            Penjualan penjualan = new Penjualan();
            
            System.out.print("Masukkan Kode: ");
            String kode = scanner.next();
            
            System.out.print("Masukkan Nama Barang: ");
            String nama = scanner.next();
            
            System.out.print("Masukkan Harga: ");
            float harga = scanner.nextFloat();
            
            System.out.print("Masukkan Jumlah: ");
            int jumlah = scanner.nextInt();
            
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();
            
            System.out.print("Input data lagi [Y/T] ?");
            String jawaban = scanner.next();
            
            if (!jawaban.equalsIgnoreCase("Y")) {
                inputLagi = false;
            }
        }
    }
}
