import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, num5, even;
        even = 0;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();

        if(num1 % 2 == 0) {
            even++;
        }
        if(num2 % 2 == 0) {
            even++;
        }
        if(num3 % 2 == 0) {
            even++;
        }
        if(num4 % 2 == 0) {
            even++;
        }
        if(num5 % 2 == 0) {
            even++;
        }

        System.out.printf("%d valores pares\n", even);
        sc.close();

    }
}
