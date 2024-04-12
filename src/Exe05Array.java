import java.util.Locale;
import java.util.Scanner;

public class Exe05Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        double average = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        average = (double) sum / count;
        System.out.println(average);
        sc.close();
    }
}
