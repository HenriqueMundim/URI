import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, sum;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x > 0 && y > 0) {
            int maior, menor;
            sum = 0;
            if (x > y) {
                maior = x;
                menor = y;
            } else {
                maior = y;
                menor = x;
            }

            for (int i = menor; i <= maior; i++) {
                sum += i;
                System.out.print(i + " ");
            }
            System.out.printf("Sum=%d\n",sum);

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
