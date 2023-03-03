package org.javacore.chapter_3.point_7_I_O;

import java.util.Date;

public class FormattingOutputDemo {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;

        //
        System.out.println(x);
        System.out.printf("%.2f", x);

        String name = "Anna";
        int age = 24;

        //
        String message = String.format("\nHello, %s. Next year, you'll be %d", name, age);
        System.out.print(message);

        //time,  Date and Time Conversion Characters
        System.out.printf("\n%tc", new Date());

        System.out.printf("\n%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
    }
}
