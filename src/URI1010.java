import java.util.Scanner;
import java.util.Locale;

public class URI1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, code2, amount1, amount2;
        double price1, price2, totalValue;

        code1 = sc.nextInt();
        amount1 = sc.nextInt();
        price1 = sc.nextDouble();

        code2 = sc.nextInt();
        amount2 = sc.nextInt();
        price2 = sc.nextDouble();

        totalValue = (amount1 * price1) + (amount2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue);
        sc.close();
    }
}
