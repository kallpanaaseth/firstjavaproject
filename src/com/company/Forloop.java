package com.company;

public class Forloop {
    public static void main(String[] args) {

        System.out.println("Printing number 1 to 100");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }

        System.out.println("Printing number 100 to 1");

        for (int i = 100; i >= 1; --i)

            System.out.println(i);

        System.out.println("Printing by skipping 1 number");

        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Printing by skipping 2 numbers");

        for (int i = 1; i <= 100; i = i + 3) {
            System.out.println(i);
        }

        System.out.println("Printing Even numbers");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Printing Odd numbers");

        for(int i=1;i<=100;i++)
        {
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }

}
