import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

public class URI1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double grade1, grade2, grade3, grade4, average, weight1, weight2, weight3, weight4;

        grade1 = sc.nextDouble();
        grade2 = sc.nextDouble();
        grade3 = sc.nextDouble();
        grade4 = sc.nextDouble();
        weight1 = 2;
        weight2 = 3;
        weight3 = 4;
        weight4 = 1;
        average = (grade1 * weight1 + grade2 * weight2 + grade3 * weight3 + grade4 * weight4) / (weight1 + weight2 + weight3 + weight4);

        if(average >= 7.0) {
            System.out.printf("Media: %.1f\nAluno aprovado.\n", average);
        } else if (average < 5.0) {
            DecimalFormat df = new DecimalFormat("#.0");
            String formatedAverage = df.format(average);
            System.out.printf("Media: %s\nAluno reprovado.\n", formatedAverage);
        } else {
            double examGrade = sc.nextDouble();
            double examAverage = (examGrade + average) / 2;
            if (examAverage >= 5.0) {
                System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n", average, examGrade, examAverage);
            } else {
                System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno reprovado.\nMedia final: %.1f\n", average, examGrade, examAverage);
            }
        }

        sc.close();
    }
}
