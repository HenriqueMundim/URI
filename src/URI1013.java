import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class URI1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB, maior;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);
        sc.close();
    }
}
