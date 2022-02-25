package com.company;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {

        // if a number is divided by 2 and remainder is 0 then even

        System.out.println("Please enter any number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is Odd");
        }
    }
}
