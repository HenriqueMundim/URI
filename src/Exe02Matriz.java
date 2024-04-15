import java.util.Scanner;

public class Exe02Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int sum;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                sum += matriz[i][j];
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
