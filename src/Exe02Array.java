import java.util.Scanner;

public class Exe02Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        sc.close();
    }
}
