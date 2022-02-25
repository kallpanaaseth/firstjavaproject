package com.company;

import java.util.Locale;

public class Nested {

    public static void main(String[] args) {
         String name = "KallPanA";

         if(name.startsWith("Ka")){

             if(name.length()>8){

                 System.out.println(name.toUpperCase());
             }

             else{
                 System.out.println(name.toLowerCase());
             }
         }
    }
}
