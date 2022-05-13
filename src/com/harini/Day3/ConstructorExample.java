package com.harini.Day3;

class Test {

    public Test() {
        System.out.println("Default Coonstructor");
    }

    public Test(int a) {
        System.out.println("Parameterised Constructor");
    }

    public void display() {
        System.out.println("Display method");
    }

}

public class ConstructorExample {
    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test(5);

    }
}
