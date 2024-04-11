import java.util.Locale;
import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double number1, number2, number3, average;
        int n;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            number1 = sc.nextDouble();
            number2 = sc.nextDouble();
            number3 = sc.nextDouble();
            average = (number1 * 2f + number2 * 3f + number3 * 5f) / 10f;
            System.out.printf("%.1f\n", average);
        }
        sc.close();
    }
}
