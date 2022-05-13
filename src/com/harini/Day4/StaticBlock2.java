package com.harini.Day4;
/*
Static block will be exeuted first and then the constructor will be executed.
 */

class Test {
    static {
        System.out.println("this is static block");
    }

    public Test() {
        System.out.println("this is a method");
    }
}

public class StaticBlock2 {
    public static void main(String[] args) {
        Test t = new Test() ;
    }
}
