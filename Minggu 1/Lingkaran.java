public class Lingkaran {
    public static void main(String[] args) {
        double phi = 3.14;
        double r, keliling;
        double d = 10;

        r = d/2;

        System.out.println("Jari-jari lingkaran: " + r );

        keliling = 2 * phi * r;

        System.out.println("Keliling lingkaran dengan Diameter " + d + " adalah " + keliling);
    }
}