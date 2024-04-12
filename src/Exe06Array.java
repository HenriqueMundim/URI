import java.util.Scanner;

public class Exe06Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        int position = 0;
        int oldest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            ages[i] = sc.nextInt();

            if (ages[i] > oldest) {
                oldest = ages[i];
                position = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s", names[position]);
        sc.close();
    }
}
