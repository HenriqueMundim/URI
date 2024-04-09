import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        number1 = sc.nextInt();
        number2 = sc.nextInt();

        if(number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
