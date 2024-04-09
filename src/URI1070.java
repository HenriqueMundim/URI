import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, odd1, odd2, odd3, odd4, odd5, odd6;

        x = sc.nextInt();

        if (x % 2 == 0) {
            odd1 = x + 1;
            odd2 = odd1 + 2;
            odd3 = odd2 + 2;
            odd4 = odd3 + 2;
            odd5 = odd4 + 2;
            odd6 = odd5 + 2;
        } else {
            odd1 = x;
            odd2 = odd1 + 2;
            odd3 = odd2 + 2;
            odd4 = odd3 + 2;
            odd5 = odd4 + 2;
            odd6 = odd5 + 2;
        }

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n", odd1, odd2, odd3, odd4, odd5, odd6);
        sc.close();
    }
}
