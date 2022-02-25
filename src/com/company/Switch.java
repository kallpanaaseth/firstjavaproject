package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value from 1-12");
        int month = sc.nextInt();

        switch(month){

            case 1:
                System.out.println("31");
                break;

            case 2:
            System.out.println("30");
            break;

            case 3:
            System.out.println("28");
            break;

            default:
                System.out.println("Sorry wrong input");
        }
        System.out.println("done");
        }

    }

