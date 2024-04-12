import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, sum, bigger, smaller;

        x = sc.nextInt();
        y = sc.nextInt();
        sum = 0;

        if(x > y) {
            bigger = x;
            smaller = y;
        } else {
            bigger = y;
            smaller = x;
        }

        for (int i = smaller; i <= bigger; i++) {
            if(i % 13 != 0) {
                sum += i;
            }
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}
