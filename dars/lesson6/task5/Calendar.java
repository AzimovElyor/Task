package online.dars.lesson6.task5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Calendar {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023,5,5);
        Month month = localDate.getMonth();
        int year = localDate.getYear();
        System.out.printf("%s, %d" , month , year);
        System.out.println();

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.printf("%s,\t" , value.name().substring(0,2));
        }
        int first = localDate.getDayOfWeek().getValue() - 1;
        System.out.println();
        for(int i = 0; i <first; i++){
            System.out.print("\t");
        }
        int length = month.length(localDate.isLeapYear());
        for(int i = 1; i <= length; i++){
            System.out.printf("%02d\t",i);
            if((first +i) % 7 == 0) System.out.println();
        }
    }
}
