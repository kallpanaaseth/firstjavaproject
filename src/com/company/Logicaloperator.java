package com.company;

import java.util.Scanner;

public class Logicaloperator {

    public static void main(String[] args) {

        System.out.println("Please enter month number from 1-12");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printNumberofdays(month);

        System.out.println("Please enter any number between 1 to 100");
        int n = sc.nextInt();
        printWish(n);
    }

    public static void printNumberofdays(int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("This month is of"+" "+"31 days");
        }


        else if(month == 2) {
            System.out.println("This month is of"+" "+"28days");
        }

        else if(month == 4 || month==6 || month==9 || month ==11) {
            System.out.println("This month is of"+" "+"30days");

        }

    }

    public static void printWish(int n) {

        if (n>1 && n<100) ;
        System.out.println("Congratulations");

    }
}

