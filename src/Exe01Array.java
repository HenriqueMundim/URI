import java.util.Scanner;
import java.util.Locale;

public class Exe01Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int position = 0;
        int n = sc.nextInt();
        double[] array = new double[n];
        double bigger = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();

            if (bigger < array[i]) {
                bigger = array[i];
                position = i;
            }
        }

        System.out.printf("%.1f\n%d", bigger, position);
    }
}
