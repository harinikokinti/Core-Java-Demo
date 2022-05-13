package com.harini.Day2;

public class Variables {
    int  x = 20; // instance variable must be outside the method and inside a class, accessible only by the instance of the class not across all the instances
    static int y = 10; //  static variable must be outside the method and accessible across all the instances of this class
    public static void main(String args[]) {
        int x = 10; // local variable

        Variables v = new Variables();
        System.out.println( "Print instance variable " + v.x);
        System.out.println("Print Static variable " + y); // no need to create class object, can be accessed directly using class name if used outside
        System.out.println("Print local variable " + x);

    }
}
