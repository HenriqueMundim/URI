import java.util.Scanner;

public class Exe03Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            int maior = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println(maior);
        }

        sc.close();
    }
}
