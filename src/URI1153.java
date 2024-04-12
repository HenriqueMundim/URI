import java.util.Scanner;

public class URI1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, fatorial;
        number = sc.nextInt();
        fatorial = number;

        for(int i = 1; i < number; i++) {
            fatorial *= (number - i);
        }

        System.out.printf("%d\n", fatorial);
        sc.close();
    }
}
