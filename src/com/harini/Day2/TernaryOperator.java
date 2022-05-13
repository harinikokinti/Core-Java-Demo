package com.harini.Day2;
/*
Ternary operator

(condition) ? "Statement1 : "Statement2"
If the condition is true, it executes Statement1, else Statement 2


 */

public class TernaryOperator {
    public static void main(String args[]) {
        int age = 20;
        String result = age >= 18 ? "Eligible for Vote" : "Not Eligible for Vote";
        int result1 = age >= 18 ? 1 : 0; // if int valye
        System.out.println(result);
        System.out.println(result1);

    }
}
