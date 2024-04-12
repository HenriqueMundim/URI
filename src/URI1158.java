import java.util.Scanner;

public class URI1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, sum, x, y, count;

        number = sc.nextInt();


        for (int i = 0; i < number; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            sum = 0;
            count = 0;

            for (int j = x; count < y; j++) {
                if (j % 2 != 0) {
                    sum += j;
                    count++;
                }
            }
            System.out.println(sum);

        }

        sc.close();
    }
}
