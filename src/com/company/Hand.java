package com.company;

public class Hand {

    public static void main(String[] args) {

        int totalfingers = 5;

        Hand hand1 = new Hand(totalfingers);
        //Hand hand2 = new Hand(ring);

        System.out.println("total number of fingers"+ " "+ "="+hand1.getHand());
        //System.out.println("If have Ring"+ " "+hand2.getHand());
    }

    public int getHand(){

        return totalfingers;
        //return ring;

    }
    int totalfingers;
    boolean ring;

    public  Hand(int stotalfingers)
    {
        this.totalfingers = stotalfingers;


    }
    //public Hand(boolean sring)
   // {
               //this.ring = sring;

    //}
}
