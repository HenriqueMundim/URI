import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        do {
            x = sc.nextInt();
            if (x != 0) {
                for (int i = 1; i < x; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(x);
            }
        } while (x != 0);

        sc.close();
    }
}
