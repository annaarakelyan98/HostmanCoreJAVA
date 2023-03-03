package org.javacore.chapter_5.point_5_and_6_varargs_enums;

import java.util.Scanner;

public class VarargsAndEnumsDemo {
    public static void main(String[] args) {
        System.out.println(max(2.3, 5.9, 6));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = scanner.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size: " + size);
        System.out.println("abbreviation: " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the _.");
        }
    }

    //varargs
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) if (v > largest) largest = v;
        return largest;
    }
}

enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");
    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}