import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, maior, menor, meio;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        maior = num1;
        menor = num1;
        meio = num2;

        if(maior < num2) {
            maior = num2;
        }
        if (maior < num3) {
            maior = num3;
        }

        if(menor > num2) {
            menor = num2;
        }
        if (menor > num3) {
            menor = num3;
        }

        if (num1 < maior && num1 > menor) {
            meio = num1;
        } else if (num3 < maior && num3 > menor) {
            meio = num3;
        }

        System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", menor, meio, maior, num1, num2, num3);
        sc.close();
    }
}
