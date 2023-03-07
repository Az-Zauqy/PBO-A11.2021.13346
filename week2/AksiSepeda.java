/*public class AksiSepeda {
    public static void main(String[] args) {
        //membuat objek
        Sepeda sepedaBalap = new Sepeda(2, "balap", "Pacific Sprinter 5.0");
        Sepeda sepedaListrik = new Sepeda(3, "Listrik", "Volta All New 100");
        Sepeda sepedaGunung = new Sepeda(2, "gunung", "Pacific");

        //mengakses atribut dan method
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear " + gearSepeda);
        sepedaBalap.ngerem();
        sepedaListrik.ngerem();
    }
}*/

public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaBalap = new Sepeda(2, "balap", "Pacific Sprinter 5.0");
        sepedaBalap.gear = 5;
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear : " + gearSepeda);
        sepedaBalap.ngerem();

        Sepeda sepedaListrik = new Sepeda(2, "Listrik", "Volta All New 100");
        sepedaListrik.gear = 1;
        int gearSepedaListrik = sepedaListrik.gear;
        System.out.println("Jumlah gear : " + gearSepedaListrik);
        sepedaListrik.ngerem();
    }
}