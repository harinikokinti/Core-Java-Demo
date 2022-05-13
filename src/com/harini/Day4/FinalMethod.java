package com.harini.Day4;
/*
Method declared as final cannot be overriden
 */

class Bike{
    public final void drive() {
        System.out.println("Driving");
    }
}

class Honda extends Bike {
    /*
    public void drive() {
        System.out.println(" Honda driving ");
    }
*/

}


public class FinalMethod {
    public static void main(String[] args) {
        Honda h =new Honda();
        h.drive();  // can get parent method
    }
}
