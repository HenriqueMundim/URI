import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Instant date = Instant.now();
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        LocalDate date2 = LocalDate.of(2022, 7, 20);
//        Instant date = Instant.now();
//        LocalDateTime localDate = LocalDateTime.ofInstant(date, ZoneId.systemDefault());
//        System.out.println(date);
//        System.out.println(localDate);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println(fmt.format(date));
    }
}
