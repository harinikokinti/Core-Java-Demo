package com.harini.Day2;

public class IfElseCondition {
    public static void main(String args[]) {
        int age = 20;

        // if else condition with  curly braces if multiple statements

        if (age >= 18) {
            System.out.println("eligible for vote");
            System.out.println("right to vote");
        } else {
            System.out.println("Not eligible for vote");
        }

        // if else condition without  curly braces, it can't have multiple statements

        if(age >= 18)
            System.out.println("eligible");
        else
            System.out.println("not eligible");

    }
}
