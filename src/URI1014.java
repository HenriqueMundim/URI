import java.util.Scanner;
import java.util.Locale;

public class URI1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distance;
        double gasAmount, average;

        distance = sc.nextInt();
        gasAmount = sc.nextDouble();

        average = distance / gasAmount;

        System.out.printf("%.3f km/l\n", average);

        sc.close();
    }
}
