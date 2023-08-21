package datetime.ex5format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter nowFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(nowFormat);
        System.out.println(formattedDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDate ld = LocalDate.parse("November 21 2023", dtf);
        System.out.println(ld);
    }
}
