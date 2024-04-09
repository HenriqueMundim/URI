import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, num5, even, odd, positive, negative;

        even = 0;
        odd = 0;
        positive = 0;
        negative = 0;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();

        if(num1 % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        if(num2 % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        if(num3 % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        if(num4 % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        if(num5 % 2 == 0) {
            even++;
         }else {
            odd++;
        }

        if(num1 > 0) {
            positive++;
        } else if(num1 < 0){
            negative++;
        }

        if(num2 > 0) {
            positive++;
        }else if(num2 < 0){
            negative++;
        }

        if(num3 > 0) {
            positive++;
        } else if(num3 < 0){
            negative++;
        }

        if(num4 > 0) {
            positive++;
        } else if(num4 < 0){
            negative++;
        }

        if(num5 > 0) {
            positive++;
        } else if(num5 < 0){
            negative++;
        }

        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", even, odd, positive, negative);
        sc.close();
    }
}
