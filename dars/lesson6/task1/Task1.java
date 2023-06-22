package online.dars.lesson6.task1;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        Instant now = Instant.now();
        LocalDateTime now1 = LocalDateTime.now();
        LocalDate now2 = LocalDate.now();
        LocalTime now3 = LocalTime.now();
        System.out.println(date);
        System.out.println(calendar);
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
    }
}
