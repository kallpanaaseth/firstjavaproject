package com.company;

import java.util.Scanner;

public class Oddorevennumberss {

    public static void main(String[] args) {

        System.out.println("Please enter any number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i > 0) {
            System.out.println("This is number is Positive");
        } else if (i < 0) {
            System.out.println("This number is Negative");
        } else
            System.out.println("Zero");
    }
}
