import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class URI1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, a, b, c;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if(A > B && A > C) {
            a = A;
            if(B > C) {
                b = B;
                c = C;
            } else {
                b = C;
                c = B;
            }
        } else if (B > C) {
            a = B;
            if(A > C) {
                b = A;
                c = C;
            } else {
                b = C;
                c = A;
            }
        } else {
            a = C;
            if(A > B) {
                b = A;
                c = B;
            } else {
                b = B;
                c = A;
            }
        }


        if((Math.abs(b - c) < a && b + c > a) && (Math.abs(a - c) < b && a + c > b) && (Math.abs(a - b) < c && a + b > c)) {
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }

        sc.close();
    }
}
