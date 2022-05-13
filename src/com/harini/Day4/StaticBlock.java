package com.harini.Day4;
/*
It prints both static block and the method values of a
20
30
 */
class A10 {
    static int a;

    static {
        a=20;
        System.out.println(a);
    }

    public void test() {
        a =30;
        System.out.println(a);
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        A10 aObj = new A10();
        aObj.test();
    }
}
