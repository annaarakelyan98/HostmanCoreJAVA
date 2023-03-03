package org.javacore.chapter_3.point_7_I_O;

import java.util.Scanner;

public class ReadingInputDemo {
    public static void main(String[] args) {
        //Scanner is the class for reading console input data
        //Because of scanner data is public, we don't use it for reading passwords
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = scanner.nextLine();

        System.out.print("How old are you: ");
        int age = scanner.nextInt();

        System.out.println(name + " is " + age + " years old!");

        //For reading passwords, we use Console class added in Java 6

      /* we can't use console, because here we have NullPointerException in this IDE.
      Most IDEs are using javaw.exe instead of java.exe to run Java code (see image below).
      Difference between these two programs is that javaw runs Java code without association
      with current terminal/console (which is useful for GUI applications),
      and since there is no associated console window System.console() returns null.
      Because of that System.console().readLine() ends up as null.readLine() which
      throws NullPointerException since null doesn't have readLine() method (nor any method/field).

      But just because there is no associated console, it doesn't mean that we can't communicate with
      javaw process. This process still supports standard input/output/error streams,
      so IDEs process (and via it also we) can use them via System.in, System.out and System.err.

      String username = System.console().readLine("Username: ");
        char[] password = System.console().readPassword("Password: ");

        System.out.println("Username: " + username + "\nPassword: " + password);*/
    }
}
