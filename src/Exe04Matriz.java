import java.util.Scanner;

public class Exe04Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                if (j > i) {
                    sum += matriz[i][j];
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
