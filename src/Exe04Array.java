import java.util.Scanner;
import java.util.Locale;

public class Exe04Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] array = new double[n];
        double average = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
            sum += array[i];
        }

        average = sum / array.length;
        System.out.println(average);

        for (int i = 0; i < array.length; i++) {
            if(array[i] < average) {
                System.out.println(array[i]);
            }
        }
        sc.close();
    }
}
