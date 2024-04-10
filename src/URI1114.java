import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password, tentative;

        password = 2002;

        tentative = sc.nextInt();

        while(password != tentative) {
            System.out.println("Senha Invalida");
            tentative = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        sc.close();
    }
}
