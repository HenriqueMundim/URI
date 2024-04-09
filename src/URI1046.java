import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end, duration;

        start = sc.nextInt();
        end = sc.nextInt();
        if (start == end) {
            duration = 24;
        } else if(end < start) {
            duration = (end + 24) - start;
        } else {
            duration = end - start;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);
        sc.close();
    }
}
