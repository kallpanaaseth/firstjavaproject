package com.company;

public class Arrays {
    public static void main(String[] args) {

        int marks[]=new int[]{10,20,50,60,90};//creating object of type array

//         -
        int s=0;///functions to use above array
        for(int i=0;i<5;i++){
            s=s+marks[i];
        }
        System.out.println(s);
    }
}
