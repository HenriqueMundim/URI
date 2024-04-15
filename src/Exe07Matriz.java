import java.util.Scanner;

public class Exe07Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        int[] aux = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int line = sc.nextInt() - 1;

        for (int i = 0; i < n; i++) {
            aux[i] = matriz[line][i];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                matriz[line][0] = aux[n - 1];
            } else {
                matriz[line][i] = aux[i - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
                if (j != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
