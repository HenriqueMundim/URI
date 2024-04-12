import java.util.Scanner;
import java.util.Locale;

public class Exe07Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] students = new String[n];
        double[] averageGrades = new double[n];

        for (int i = 0; i < n; i++){
            students[i] = sc.next();
            averageGrades[i] = (sc.nextDouble() + sc.nextDouble()) / 2;
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++){
            if(averageGrades[i] >= 6) {
                System.out.println(students[i]);
            }
        }

        sc.close();
    }
}
