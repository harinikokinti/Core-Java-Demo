package com.harini.Day4;
/*
The counter value changes if given static
 */

class Counter{
    static int counter = 0;

    public  Counter() {
        counter ++;
        System.out.println("The a value is " + counter);

    }
}

public class StaticVariableCounterExample {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

    }

}
