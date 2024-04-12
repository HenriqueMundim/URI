import java.util.Scanner;
import java.lang.Math;

public class URI1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d\n", i, square, cube);
            System.out.printf("%d %d %d\n", i, square + 1, cube + 1);
        }

        sc.close();
    }
}
