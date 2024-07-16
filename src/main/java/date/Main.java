package date;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        //16.07.2024 09:42:30:000 +2:00

        ZonedDateTime zoned = ZonedDateTime.now();
        ZonedDateTime zoned1 = ZonedDateTime.of(2024,
                7,
                16,
                9,
                56,
                30,
                123456,
                ZoneId.systemDefault());


        Instant instant = Instant.now();
        Instant instant1 = Instant.parse("2024-07-16T07:59:37.336161Z");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(zoned);
        System.out.println(zoned1);
        System.out.println("-------------");
        System.out.println(instant);
        System.out.println("-------------");
        System.out.println(localDateTime);
        System.out.println("-------------");
        System.out.println(instant1.atZone(ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
        System.out.println("-------------");
        System.out.println(instant.plus(3, ChronoUnit.DAYS));
        System.out.println(instant.minus(3, ChronoUnit.HOURS));
        System.out.println("-------------");

        //DateTime Format Pattern
        //yyyy-MM-dd-hh:mm:ss

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd-hh:mm:ss");

        LocalDateTime l = LocalDateTime.now();
        System.out.println(l.format(formatter));

        System.out.println("1721117988");
    }
}
