import java.util.Locale;
import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double grade1, grade2, grade3, weight1, weight2, weight3, average;

        weight1 = 2.0;;
        weight2 = 3.0;
        weight3 = 5.0;

        grade1 = sc.nextDouble();
        grade2 = sc.nextDouble();
        grade3 = sc.nextDouble();

        average = ((grade1 * weight1) + (grade2 * weight2) + (grade3 * weight3)) / (weight1 + weight2 + weight3);

        System.out.printf("MEDIA = %.1f", average);

        System.out.println();
    }
}
