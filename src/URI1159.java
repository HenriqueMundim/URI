import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, sum, even1, even2, even3, even4, even5;

        number = 1;

        while (number != 0) {
            number = sc.nextInt();

            if (number != 0) {
                if (number % 2 == 0) {
                    even1 = number;
                    even2 = even1 + 2;
                    even3 = even2 + 2;
                    even4 = even3 + 2;
                    even5 = even4 + 2;
                } else {
                    even1 = number + 1;
                    even2 = even1 + 2;
                    even3 = even2 + 2;
                    even4 = even3 + 2;
                    even5 = even4 + 2;
                }

                sum = even1 + even2 + even3 + even4 + even5;
                System.out.printf("%d\n", sum);
            }
        }

        sc.close();
    }
}
