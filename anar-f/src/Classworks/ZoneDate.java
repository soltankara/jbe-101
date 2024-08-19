package Classworks;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDate {
    ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

}
