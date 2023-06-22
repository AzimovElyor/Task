package online.dars.lesson6.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.print("Sanani kiriting  (yyyy/MM/dd) --> ");
        String date = scanner.nextLine();
        Date parse = simpleDateFormat.parse(date);
        System.out.println(parse);


    }
}
