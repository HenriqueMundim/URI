import java.util.Locale;
import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary, readjustment;
        String percentage;
        salary = sc.nextDouble();

        if(salary <= 400) {
            percentage = "15 %";
            readjustment = salary * 0.15;
            salary *= 1.15;
        } else if (salary <= 800) {
            percentage = "12 %";
            readjustment = salary * 0.12;
            salary *= 1.12;
        } else if (salary <= 1200) {
            percentage = "10 %";
            readjustment = salary * 0.10;
            salary *= 1.10;
        } else if (salary <= 2000) {
            percentage = "7 %";
            readjustment = salary * 0.07;
            salary *= 1.07;
        } else {
            percentage = "4 %";
            readjustment = salary * 0.04;
            salary *= 1.04;
        }

        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %s\n", salary, readjustment, percentage);
        sc.close();
    }
}
