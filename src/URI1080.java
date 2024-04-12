import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, bigger, position;
        bigger = Integer.MIN_VALUE;
        position = 0;

        for(int i = 1; i <= 100; i++) {
            number = sc.nextInt();

            if(number > bigger) {
                bigger = number;
                position = i;
            }
        }

        System.out.printf("%d\n%d\n", bigger, position);
        sc.close();
    }
}
