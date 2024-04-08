import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int firstDayHour, firstDayMinute, firstDaySecond, lastDayHour, lastDayMinute, lastDaySecond, start, end, firstDay, lastDay, duration, rest, days, hours, minutes, seconds;

        sc.next();
        firstDay = sc.nextInt();
        firstDayHour = sc.nextInt();
        sc.next();
        firstDayMinute = sc.nextInt();
        sc.next();
        firstDaySecond = sc.nextInt();
        sc.next();
        lastDay = sc.nextInt();
        lastDayHour = sc.nextInt();
        sc.next();
        lastDayMinute = sc.nextInt();
        sc.next();
        lastDaySecond = sc.nextInt();

        start = (firstDay * 24 * 60 * 60) + (firstDayHour * 60 * 60) + (firstDayMinute * 60) + firstDaySecond;
        end = (lastDay * 24 * 60 * 60) + (lastDayHour * 60 * 60) + (lastDayMinute * 60) + lastDaySecond;
        duration = end - start;
        days = duration / (24 * 60 * 60);
        rest = duration % (24 * 60 * 60);
        hours = rest / (60 * 60);
        rest = rest % (60 * 60);
        minutes = rest / 60;
        seconds = rest % 60;
        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", days, hours, minutes, seconds);
        sc.close();
    }
}
