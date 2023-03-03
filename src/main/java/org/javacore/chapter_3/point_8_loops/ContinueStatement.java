package org.javacore.chapter_3.point_8_loops;

import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int goal = 10;

        //1st example, continue
        while (sum < goal) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if (n < 0) continue;
            sum += n; // not executed if n < 0

            System.out.println(sum);
        }

        //2nd example, continue
        for (int count = 1; count <= 100; count++) {
            System.out.print("Enter a number, -1 to quit: ");
            int n = scanner.nextInt();
            if (n < 0) continue;
            sum += n; // not executed if n < 0

            System.out.println(sum);
        }
    }
}
