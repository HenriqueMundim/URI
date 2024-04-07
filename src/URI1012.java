import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class URI1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, circleArea, rightTriangleArea, trapezeArea, squereArea,
                rectangleArea;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        rightTriangleArea = (A * C) / 2;
        circleArea = pi * Math.pow(C, 2);
        trapezeArea = ((A + B) / 2) * C;
        squereArea = Math.pow(B, 2);
        rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", rightTriangleArea, circleArea, trapezeArea, squereArea, rectangleArea);
    }
}
