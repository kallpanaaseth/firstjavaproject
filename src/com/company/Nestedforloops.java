package com.company;

public class Nestedforloops {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) ///row
        {
            for (int j = 1; j <= i; j++)//column/// {
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) ///row
        {
            for (int j = 1; j <= i; j++)//column/// {
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
