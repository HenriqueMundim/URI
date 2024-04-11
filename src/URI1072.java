import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, in, out, number;
        in = 0;
        out = 0;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();

            if (number >= 10 && number <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out\n", in, out);
        sc.close();
    }
}
