import java.util.Scanner;

public class URI1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3, number4, result;
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();

        result = (number1 * number2) - (number3 * number4);

        System.out.printf("DIFERENCA = %d", result);
        System.out.println();

        sc.close();
    }
}
