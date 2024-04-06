import java.util.Scanner;
import java.util.Locale;

public class URI1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distance, time;

        distance = sc.nextInt();

        time = distance * 2;

        System.out.printf("%d minutos\n", time);
        sc.close();
    }
}
