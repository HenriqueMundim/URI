import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exe06Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] matriz = new double[n][n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();

                if (matriz[i][j] > 0) {
                    sum += matriz[i][j];
                }
            }
        }

        int line = sc.nextInt();
        int colunm = sc.nextInt();

        System.out.printf("SOMA DOS POSITIVOS: %.1f\n", sum);

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[line][i]);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][colunm]);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j]);
                    if (i != n - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
                System.out.print(matriz[i][j]);
                if (j != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
