import java.util.Scanner;
import java.util.Locale;

public class URI1008 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int number, amountHours;
    double valueHour, salary;

    number = sc.nextInt();
    amountHours = sc.nextInt();
    valueHour = sc.nextDouble();

    salary = amountHours * valueHour;
    System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary);

    sc.close();
    }
}
