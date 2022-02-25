package com.company;

public class Handfeature {

    public static void main(String[] args) {

        int f = 5;
        fingerscount(f);

        boolean hasRings = true;
        hasRings();

    }

    public static void fingerscount(int f) {
        System.out.println("Number of Fingers are" + " " + f);
    }

    public static void hasRings() {
        System.out.println("Yes she has rings");
    }
}