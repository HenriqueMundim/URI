import java.util.Locale;
import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double number1, number2, result;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            number1 = sc.nextDouble();
            number2 = sc.nextDouble();

            if(number2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                result = (double) number1 / number2;
                System.out.printf("%.1f\n", result);
            }
        }

        sc.close();
    }
}
