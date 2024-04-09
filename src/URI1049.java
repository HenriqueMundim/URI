import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1, word2, word3;
        String answer = "";
        word1 = sc.next();
        word2 = sc.next();
        word3 = sc.next();

        if (word1.equals("vertebrado")) {
            if (word2.equals("ave") && word3.equals("carnivoro")) {
                answer = "aguia";
            } else if (word2.equals("ave") && word3.equals("onivoro")) {
                answer = "pomba";
            } else if (word2.equals("mamifero") && word3.equals("onivoro")) {
                answer = "homem";
            } else if (word2.equals("mamifero") && word3.equals("herbivoro")) {
                answer = "vaca";
            }
        } else {
            if (word2.equals("anelideo") && word3.equals("hematofago")) {
                answer = "sanguessuga";
            } else if (word2.equals("anelideo") && word3.equals("onivoro")) {
                answer = "minhoca";
            } else if (word2.equals("inseto") && word3.equals("hematofago")) {
                answer = "pulga";
            } else if (word2.equals("inseto") && word3.equals("herbivoro")) {
                answer = "lagarta";
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
