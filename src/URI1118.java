import java.util.Scanner;
import java.util.Locale;

public class URI1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double grade, sum, average;
        int choice, count;

        sum = 0;
        count = 0;

        while (count < 2) {
            grade = sc.nextDouble();

            if (grade < 0 || grade > 10) {
                System.out.println("nota invalida");
            } else {
                count++;
                sum += grade;

                if (count == 2) {
                    average = sum / count;
                    System.out.printf("media = %.2f\n", average);

                    System.out.println("novo calculo (1-sim 2-nao)");
                    choice = sc.nextInt();

                    while (choice > 2 || choice < 1) {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        choice = sc.nextInt();
                    }

                    if (choice == 1) {
                        sum = 0;
                        count = 0;
                        average = 0;
                    }
                }
            }
        }

        sc.close();
    }
}
