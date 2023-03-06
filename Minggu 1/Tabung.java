public class Tabung {
    public static void main(String[] args) {
        double diameter = 5;
        double tinggi = 10;
        double pi = 3.14;
        double jariJari, volume;

        jariJari = diameter/2;

        System.out.println("Diameter Tabung : " + diameter);

        System.out.println("tinggi Tabung : " + tinggi);

        System.out.println("jari-jari Tabung : "+ diameter + " / 2 = " + jariJari);

        System.out.println("Phi Tabung : " + pi);

        // menghitung volume tabung
        volume = pi * jariJari * tinggi;

        System.out.println("Volume tabung adalah " + pi + "*" + jariJari + "*" + tinggi + " = "+ volume);
    }
}