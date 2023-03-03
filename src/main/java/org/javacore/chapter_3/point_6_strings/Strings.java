package org.javacore.chapter_3.point_6_strings;

/*.under String work char sequence
 * .string is immutable
 *         1) every time when we do some changes in string,
 *            we create new string
 * .StringBuilder and StringBuffer are mutable
 *         1) every time when we do some changes in string,
 *           we change the same string
 *        2) StringBuffer is synchronized - thread safe,
 *           it means two threads can't call the methods of StringBuffer simultaneously.
 */

public class Strings {
    public static void main(String[] args) {

        //join strings with something(in this case .)
        String all = String.join(" . ", "S", "M", "L", "XL");
        System.out.println(all);

        /*java 11
         * "string".repeat(int n) - repeat string n time*/
        String s = "Anna".repeat(2);
        System.out.println(s);

        String greeting = "Hello";
        int n = greeting.length();

        /*Returns the number of Unicode code points in the specified text range of this String.
        The text range begins at the specified beginIndex and extends to the char at index endIndex
        */
        int cpCount = greeting.codePointCount(1, greeting.length());
        System.out.println(cpCount);

        System.out.println(n);

        //reference of strings
        //1 example, s1 = s2 is true, because both referred to the same object in heap's literal memory
        //by string literals
        String s1 = "Arman";
        String s2 = "Arman";

        boolean isTrue = s1 == s2;
        System.out.println(isTrue);

        //2 example, s3 = s4 is false, because they referred to different objects in heap
        //by new keyword
        String s3 = new String("Artur");
        String s4 = new String("Artur");

        boolean isEqual = (s3 ==s4);
        System.out.println(isEqual);

        //StringBuilder and StringBuffer examples
        //StringBuffer is the same but in multithreading
        //append = add
        StringBuilder stringBuilder = new StringBuilder("Poxos");
        stringBuilder.append("Petros");

        System.out.println(stringBuilder);
    }
}

