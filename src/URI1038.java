import java.util.Scanner;
import java.util.Locale;

public class URI1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code, amount;
        double bill = 0.0;

        code = sc.nextInt();
        amount = sc.nextInt();

        switch (code) {
            case 1:
                bill = amount * 4.0;
                break;
            case 2:
                bill = amount * 4.5;
                break;
            case 3:
                bill = amount * 5.0;
                break;
            case 4:
                bill = amount * 2.0;
                break;
            case 5:
                bill = amount * 1.5;
                break;
            default:
                System.out.println("Invalid code");
        }

        System.out.printf("Total: R$ %.2f\n", bill);
        sc.close();
    }
}
