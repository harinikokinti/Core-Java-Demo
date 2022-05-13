package com.harini.Day3;

public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("Start");
        for(int i=0; i<10; i++) {
            if(i==6)
                break;  // to break the loop when i = 6

            System.out.println(i);
        }
        System.out.println("End");
    }
}
