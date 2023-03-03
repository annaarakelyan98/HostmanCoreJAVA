package org.javacore.chapter_4.point_1_dates;

import java.time.LocalDate;

public class DateTimes {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate thousandYearsLater = currentDate.plusYears(1000);

        System.out.println(thousandYearsLater.getYear());
    }
}
