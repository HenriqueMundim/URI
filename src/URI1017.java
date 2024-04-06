import java.util.Locale;
import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hours, speedAverage, distance;
        double gasTotal;

        hours = sc.nextInt();
        speedAverage = sc.nextInt();
        distance = hours * speedAverage;

        gasTotal = distance / 12.0;

        System.out.printf("%.3f\n", gasTotal);
        sc.close();
    }
}
