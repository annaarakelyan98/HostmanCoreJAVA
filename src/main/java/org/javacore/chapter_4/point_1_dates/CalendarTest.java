package org.javacore.chapter_4.point_1_dates;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 2);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();//Monday = 1, ... , Sunday = 7

        System.out.println("Mon Tue Wed Thu Fri Sat San");

        for (int i = 1; i < value; i++) {
            System.out.print(" ");
            while (date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today)
                    System.out.print("*");
                else
                    System.out.print(" ");
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) System.out.println();
            }
            if (date.getDayOfWeek().getValue() != 1) System.out.println();
        }
    }
}
