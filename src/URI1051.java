import java.util.Locale;
import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double income, tax;
        
        income = sc.nextDouble();
        
        if (income <= 2000) {
            System.out.println("Isento");
        } else if (income <= 3000) {
            tax = (income - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", tax);
        } else if (income <= 4500) {
            tax = ((income - 3000) * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", tax);
        } else {
            tax = ((income - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", tax);
        }


    }
}
