package com.company;

public class Head {


    public static void main(String[] args) {

        String haircolor = "Red";
        String eyecolor = "Brown";

        Head head1 = new Head(haircolor, eyecolor);


        System.out.println("Color of Hair and Eyes are " + " " + head1.getHead());

    }

    public String getHead() {

        return haircolor + " " + eyecolor;
    }

    String haircolor;
    String eyecolor;

    public Head(String shaircolor, String seyecolor) {
        this.haircolor = shaircolor;
        this.eyecolor = seyecolor;
    }
}
