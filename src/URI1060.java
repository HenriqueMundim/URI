import java.util.Scanner;
import java.util.Locale;

public class URI1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, num4, num5, num6;
        int positive = 0;

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        num4 = sc.nextDouble();
        num5 = sc.nextDouble();
        num6 = sc.nextDouble();

        if(num1 > 0) {
            positive++;
        }
        if(num2 > 0) {
            positive++;
        }
        if(num3 > 0) {
            positive++;
        }
        if(num4 > 0) {
            positive++;
        }
        if(num5 > 0) {
            positive++;
        }
        if(num6 > 0) {
            positive++;
        }

        System.out.printf("%d valores positivos\n", positive);
        sc.close();
    }
}
