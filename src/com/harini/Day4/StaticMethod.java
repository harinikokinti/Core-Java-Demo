package com.harini.Day4;

class Calculator{
    // non static method

    public void addition(int a, int b) {
        System.out.println("Addiiton: " + (a+b));
    }


    // static method

    static public void substraction(int a, int b) {
        System.out.println("Substraction: " + (a-b));
    }


}

public class StaticMethod {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.addition(2,3);
        Calculator.substraction(5,1);

    }
}
