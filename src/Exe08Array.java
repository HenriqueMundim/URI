import java.util.Locale;
import java.util.Scanner;

public class Exe08Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] height = new double[n];
        int men = 0;
        int woman = 0;
        double sum = 0;
        double bigger = Double.MIN_VALUE;
        double smaller = Double.MAX_VALUE;

        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextDouble();
            char gender = sc.next().charAt(0);

            if (gender == 'F') {
                sum += height[i];
                woman++;
            } else if (gender == 'M') {
                men++;
            }
            if(height[i] > bigger) {
                bigger = height[i];
            }
            if(height[i] < smaller) {
                smaller = height[i];
            }
        }

        System.out.printf("Menor altura = %.2f\nMaior altura = %.2f\nMedia das alturas das mulheres = %.2f\nNumero de homens = %d\n", smaller, bigger, sum / woman, men);
        sc.close();
    }
}
