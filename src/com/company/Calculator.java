package com.company;

public class Calculator {

    public static void main(String[] args) {

        // write your code here
        System.out.println(sum(2, 4));

        System.out.println(mul(2, 4));

        int divide = div(4, 2);
        System.out.println("Division of a/b" + "=" + (divide));

        System.out.println(sub(4, 2));
    }

    public static int sum(int a, int b) {
        return a + b;

    }

    public static int mul(int a, int b) {
        return a * b;

    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}

