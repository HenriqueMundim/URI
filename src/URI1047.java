import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHr, startMin, endHr, endMin, durationHours, durationMinutes, secondsStart, secondsEnd, rest;

        startHr = sc.nextInt();
        startMin = sc.nextInt();
        endHr = sc.nextInt();
        endMin = sc.nextInt();

        secondsStart = (startHr * 60 * 60) + (startMin * 60);
        secondsEnd = (endHr * 60 * 60) + (endMin * 60);

        if (secondsStart == secondsEnd) {
            durationHours = 24;
            durationMinutes = 0;
        } else if(secondsEnd < secondsStart) {
            if(endMin == startMin) {
                durationHours = (endHr + 24) - startHr;
                durationMinutes = 0;
            } else {
                int diff = (secondsEnd - secondsStart) + (24 * 60 * 60);
                durationHours = diff / 3600;
                durationMinutes = (diff % 3600) / 60;
            }
        } else {
            if(endHr - startHr == 1 && endMin != startMin){
                durationHours = 0;
                durationMinutes = (endMin + 60) - startMin;
            } else {
                int diff = (secondsEnd - secondsStart);
                durationHours = diff / 3600;
                durationMinutes = (diff % 3600) / 60;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHours, durationMinutes);
        sc.close();
    }
}
