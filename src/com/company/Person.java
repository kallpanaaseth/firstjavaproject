package com.company;

public class Person {

    public static void main(String[] args) {

        int n = 21;
        personAge(n);

        String name = "Kallpana";
        personName(name);
    }

    public static void personAge(int n) {
        if (n >= 21) {
            System.out.println("She is an adult");
        }
    }

    public static void personName(String name) {
        System.out.println("Her name is" + " " + name);
    }

}

