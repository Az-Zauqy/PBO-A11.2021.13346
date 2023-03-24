import java.util.Scanner;

public class RumusABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        double D = b * b - 4 * a * c;

        if (D < 0) {
            double x1 = -b / 2 * a + Math.sqrt(-D) / 2 * a;
            double x2 = -b / 2 * a - Math.sqrt(-D) / 2 * a;
            System.out.println("x1 = "+x1+ " x2 = "+x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Persamaan memiliki satu akar kembar: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Persamaan memiliki dua akar: x1 = " + x1 + " dan x2 = " + x2);
        }
    }
}
