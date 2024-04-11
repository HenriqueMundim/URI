import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, alcohol, gasoline, diesel;

        choice = 1;
        alcohol = 0;
        gasoline = 0;
        diesel = 0;

        while (choice != 4) {
            choice = sc.nextInt();

            while (choice < 1 || choice > 4) {
                choice = sc.nextInt();
            }

            if (choice == 1) {
                alcohol++;
            } else if (choice == 2) {
                gasoline++;
            } else if (choice == 3) {
                diesel++;
            }
        }

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcohol, gasoline, diesel);
        sc.close();
    }
}
