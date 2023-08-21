package datetime.ex4zonedatetime;


import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        ZonedDateTime event = ZonedDateTime.of(2023, 11, 21, 10, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        System.out.println(event);

        LocalTime startTime = LocalTime.of(9,0);
        LocalTime endTime = LocalTime.of(17,0);
        Duration dur = Duration.between(startTime, endTime);
        System.out.println(dur);

        LocalDate startDate = LocalDate.of(2023, 1,1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period per = Period.between(startDate, endDate);
        System.out.println(per);
    }
}
