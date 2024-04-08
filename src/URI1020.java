import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days, years, months, age, rest;

        age = sc.nextInt();
        years = age / 365;
        rest = age % 365;
        months = rest / 30;
        days = rest % 30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
        sc.close();
    }
}
