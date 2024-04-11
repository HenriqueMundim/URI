import java.util.Locale;
import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double grade, count, sum, average;

        count = 0;
        sum = 0;

        while (count < 2) {
            grade = sc.nextDouble();

            if (grade < 0 || grade > 10) {
                System.out.println("nota invalida");
            } else {
                sum += grade;
                count++;
            }
        }

        average = sum / count;
        System.out.printf("media = %.2f\n", average);
        sc.close();
    }
}
