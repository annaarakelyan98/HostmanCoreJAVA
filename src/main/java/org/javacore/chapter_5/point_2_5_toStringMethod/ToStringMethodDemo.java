package org.javacore.chapter_5.point_2_5_toStringMethod;

import java.util.Arrays;

public class ToStringMethodDemo {
    public static void main(String[] args) {
        Person person = new Person("Anna", "Arakelyan", 24);
/*
        instead of toString() method, when we write '"" + object',
        we have "Person@5ebec15"
        but
        when we use toString() method
        we have "Person{name='Anna', surname='Arakelyan', age=24}"
*/
        String message = "" + person;

        System.out.println(message);

        person.toString();

        //array example
        int[] array = {1, 4, 66, 77, 8};

        /*
        toString - [1, 4, 66, 77, 8]
        "" + array - [I@2d3fcdbd, where [I prefix denotes(cuyc tal/ nshanakel) the array
        */
        System.out.println(Arrays.toString(array));
        String s = "" + array;
        System.out.println(s);
    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}