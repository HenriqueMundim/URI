import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class URI1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        int radius;
        double volume;

        radius = sc.nextInt();
        volume = (4/3.0) * pi * Math.pow(radius, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
        sc.close();
    }
}
