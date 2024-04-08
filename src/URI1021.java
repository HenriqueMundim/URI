import java.util.Scanner;
import java.util.Locale;

public class URI1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value, rest;

        value = sc.nextDouble();

        int qnt100 = (int) value / 100;
        rest = value % 100;
        int qnt50 = (int) rest / 50;
        rest = rest % 50;
        int qnt20 = (int) rest / 20;
        rest = rest % 20;
        int qnt10 = (int) rest / 10;
        rest = rest % 10;
        int qnt5 = (int) rest / 5;
        rest = rest % 5;
        int qnt2 = (int) rest / 2;
        rest = rest % 2;

        int qntCoins1 = (int) rest;
        rest = (rest * 100) % 100;
        int qntCoins50 = (int) rest / 50;
        rest = rest % 50;
        int qntCoins25 = (int) rest / 25;
        rest = rest % 25;
        int qntCoins10 = (int) rest / 10;
        rest = rest % 10;
        int qntCoins5 = (int) rest / 5;
        rest = rest % 5;
        int qnt1cent = (int) rest;

        System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\nMOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n", qnt100, qnt50, qnt20, qnt10, qnt5, qnt2, qntCoins1, qntCoins50, qntCoins25, qntCoins10, qntCoins5, qnt1cent);
        sc.close();
    }
}



