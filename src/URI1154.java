import java.util.Scanner;
import java.util.Locale;

public class URI1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int age, count, sum;
        double average;

        age = 1;
        count = 0;
        sum = 0;

        while (age > 0) {
            age = sc.nextInt();

            if (age > 0) {
                count++;
                sum += age;
            }
        }

        average = (double) sum / count;
        System.out.printf("%.2f\n", average);
        sc.close();
    }
}
