import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class URI1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else if(delta == 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }

        sc.close();
    }
}
