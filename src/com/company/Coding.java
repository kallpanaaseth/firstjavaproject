package com.company;

public class Coding {

    public static void main(String[] args) {

        int n=22;
        diff21(n);

    }

    public static void diff21(int n) {

        for (n = 1; n <= 21; n++) {

            if (n <= 21) {
                System.out.println(21 - n);
            } else {
                System.out.println(2 * (n - 21));
            }
        }


        /*else
        {
            return 2*(n-21);
        }*/

    }
}
