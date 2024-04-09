import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class URI1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if((Math.abs(b - c) < a && b + c > a) && (Math.abs(a - c) < b && a + c > b) && (Math.abs(a - b) < c && a + b > c)) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = ((a + b) / 2) * c;
            System.out.printf("Area = %.1f\n", area);
        }

        sc.close();
    }
}
