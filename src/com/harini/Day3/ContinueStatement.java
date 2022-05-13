package com.harini.Day3;
/*
This is a jump statement
skips the condiiton
 */
public class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("Start");
        for(int i=0; i<10; i++) {
            if(i==5)
                continue;  // here the loop will not print 5 , it skips i =5 and prints the rest of numbers
            System.out.println(i);
        }
        System.out.println("End");
    }
}
