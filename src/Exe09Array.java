import java.util.Scanner;
import java.util.Locale;

public class Exe09Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] products = new String[n];
        double[] purchasePrice = new double[n];
        double[] sellingPrice = new double[n];
        double totalPurchasePrice = 0.0;
        double totalSellingPrice = 0.0;
        int profitBelow10 = 0;
        int profitBetween10and20 = 0;
        int profitAbove20 = 0;
        double totalProfit;

        for (int i = 0; i < n; i++) {
            products[i] = sc.next();
            purchasePrice[i] = sc.nextDouble();
            sellingPrice[i] = sc.nextDouble();

            totalPurchasePrice += purchasePrice[i];
            totalSellingPrice += sellingPrice[i];
        }

        for (int i = 0; i < n; i++) {
            if (sellingPrice[i] - purchasePrice[i] < purchasePrice[i] * 0.10) {
                profitBelow10++;
            } else if (sellingPrice[i] - purchasePrice[i] > purchasePrice[i] * 0.20) {
                profitAbove20++;
            } else {
                profitBetween10and20++;
            }
        }

        totalProfit = totalSellingPrice - totalPurchasePrice;

        System.out.printf("Lucro abaixo de 10%%: %d\nLucro entre 10%% e 20%%: %d\nLucro acima de 20%%: %d\nValor total de compra: %.2f\nValor total de venda: %.2f\nLucro total: %.2f\n", profitBelow10, profitBetween10and20, profitAbove20, totalPurchasePrice, totalSellingPrice, totalProfit);

    }
}
