package com.harini.Day2;

public class IfElseIfElseConditon {
    public static void main(String args[]) {
        int score  = 70;

        if(score == 90)
            System.out.println("A Grade");
        else if(score < 90 && score > 70)
            System.out.println("B Grade");
        else if(score < 75 && score >50 )
            System.out.println("C Grade");
        else
            System.out.println("D Grade");
    }
}
