import java.util.Scanner;
import java.util.Locale;

public class URI1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, average, weight1, weight2;

        weight1 = 3.5;
        weight2 = 7.5;

        A = sc.nextDouble();
        B = sc.nextDouble();

        average = (A * weight1 + B * weight2) / (weight1 + weight2);

        System.out.printf("MEDIA = %.5f", average);
        System.out.println();
        sc.close();
    }
}
