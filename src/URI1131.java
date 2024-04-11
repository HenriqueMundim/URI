import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inter, gremio, count, golInter, golGremio, empate, escolha;

        escolha = 1;
        count = 0;
        inter = 0;
        gremio = 0;
        empate = 0;

        while (escolha != 2) {
            golInter = sc.nextInt();
            golGremio = sc.nextInt();
            count++;

            if (golInter > golGremio) {
                inter++;
            } else if (golGremio > golInter) {
                gremio++;
            } else {
                empate++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            escolha = sc.nextInt();
        }

        if (gremio > inter) {
            System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\nGremio venceu mais\n", count, inter, gremio, empate);
        } else if (inter > gremio) {
            System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\nInter venceu mais\n", count, inter, gremio, empate);
        } else {
            System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\nNao houve vencedor\n", count, inter, gremio, empate);
        }
    }
}
