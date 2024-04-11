import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, number;

        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            number = sc.nextInt();
            if (number == 0) {
                System.out.println("NULL");
            } else if(number < 0 && number % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else if (number > 0 && number % 2 != 0) {
                System.out.println("ODD POSITIVE");
            }
            if (number > 0 && number % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (number % 2 == 0 && number < 0) {
                System.out.println("EVEN NEGATIVE");
            }
        }
        sc.close();
    }
}
