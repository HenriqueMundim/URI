import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d\n", i);
            }
        }

        sc.close();
    }
}
