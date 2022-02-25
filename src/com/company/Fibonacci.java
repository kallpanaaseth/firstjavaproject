package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8

        int fib=0;

        for(int i=0;i<=10;i++)
        {
            fib=fib+i;

            System.out.println("Printing Fibonacci series:"+fib);
        }

    }
}
