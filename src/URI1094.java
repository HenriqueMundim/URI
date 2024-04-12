import java.util.Locale;
import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cases, rat, frog, rabbit, total;
        double porcentageRat, porcentageRabbit, porcentageFrog;

        rat = 0;
        frog = 0;
        rabbit = 0;
        total = 0;

        cases = sc.nextInt();

        for(int i = 0; i < cases; i++) {
            int amount = sc.nextInt();
            char guineaPig = sc.next().charAt(0);
            total += amount;
            if(guineaPig == 'R') {
                rat += amount;
            } else if (guineaPig == 'S') {
                frog += amount;
            } else if (guineaPig == 'C'){
                rabbit += amount;
            }
        }

        porcentageRat = (double) (rat * 100) / total;
        porcentageRabbit = (double) (rabbit * 100) / total;
        porcentageFrog = (double) (frog * 100) / total;

        System.out.printf("Total: %d cobaias\nTotal de coelhos: %d\nTotal de ratos: %d\nTotal de sapos: %d\nPercentual de coelhos: %.2f %%\nPercentual de ratos: %.2f %%\nPercentual de sapos: %.2f %%\n", total, rabbit, rat, frog, porcentageRabbit, porcentageRat, porcentageFrog);
    }
}
