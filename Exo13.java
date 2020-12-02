package ma.to.dart;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exo13 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("2019-07-10 14:06",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
ZoneId zoneId= ZoneId.of("+02:00");
ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

 System.out.println(zonedDateTime.withZoneSameInstant(zoneId.of("UTC")).toLocalDateTime());
}
}
