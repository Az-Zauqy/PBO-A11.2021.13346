import java.util.Scanner;

public class CellphoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cellphone cp = new Cellphone("POCO", "FINDX");
        cp.powerOn();

        boolean exit = false; 

        while (!exit) { 
            System.out.println("Menu:");
            System.out.println("1. Isi pulsa");
            System.out.println("2. Tambah contact");
            System.out.println("3. Liat contacts");
            System.out.println("4. Cari contact");
            System.out.println("5. Matikan HP");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); 

            switch (choice) { 
                case 1: 
                    System.out.print("Masukkan Ingin Mengisi pulsa berapa: ");
                    int amount = sc.nextInt();
                    cp.topUp(amount);
                    break;
                case 2: 
                    sc.nextLine();
                    System.out.print("Beri nama kontak baru: ");
                    String name = sc.nextLine();
                    System.out.print("Masukkan Nomor kontak baru: ");
                    String number = sc.nextLine();
                    cp.addContact(name, number);
                    break;
                case 3: 
                    cp.viewContacts();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Masukkan nama kotak yang ingin di cari: ");
                    String search = sc.nextLine();
                    Contact c = cp.findContact(search);
                    if (c != null) {
                        System.out.println("Kontak ketemu: " + c.getNama() + " - " + c.getNomor());
                    } else {
                        System.out.println("kontak tidak dapat ditemukan");
                    }
                    break;
                case 5: 
                    cp.powerOff();
                    exit = true; 
                    break;
                default: 
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}