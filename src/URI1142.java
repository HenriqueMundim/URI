import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        number = sc.nextInt();

        for(int i = 0; i < number; i++) {
            int last = (i + 1) * 3 + i;
            int mid = last - 1;
            int first = last - 2;
            System.out.printf("%d %d %d PUM\n", first, mid, last);
        }

        sc.close();
    }
}
