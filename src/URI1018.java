import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price, qnt100, qnt50, qnt20, qnt10, qnt5, qnt2, qnt1, resto;

        price = sc.nextInt();
        qnt100 = price / 100;
        resto = price % 100;
        qnt50 = resto / 50;
        resto = resto % 50;
        qnt20 = resto / 20;
        resto = resto % 20;
        qnt10 = resto / 10;
        resto = resto % 10;
        qnt5 = resto / 5;
        resto = resto % 5;
        qnt2 = resto / 2;
        resto = resto % 2;
        qnt1 = resto;


        System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",price, qnt100, qnt50, qnt20, qnt10, qnt5, qnt2, qnt1);
        sc.close();
    }
}
