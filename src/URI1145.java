import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int amountLine, max;
        String line = "";
        amountLine = sc.nextInt();
        max = sc.nextInt();

        for (int i = 1; i <= max; i++) {
            if (line.isEmpty()) {
                line += i;
            } else {
                line += " " + i;
            }
            if (i % amountLine == 0 || i == max) {
                System.out.printf("%s\n", line);
                line = "";
            }
        }

        sc.close();
    }
}
