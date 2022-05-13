package com.harini.Day4;

class Car {
    public final int speedLimit = 20;  //  its value cannot be modified anywhere if given final

    public void drive() {
       // speedLimit = 40;
        System.out.println("Car driving speed limit is :" + speedLimit);
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        Car car = new Car();
    //    car.speedLimit = 30;
        car.drive();


    }
}


/*
class Test2 {
    public final int x = 10;

    public void display() {
        System.out.println("X value " + x);
    }


}


public class FinalVariable {
    public static void main(String[] args) {
        Test2 t = new Test2();
       // t.x = 20;  //  cannot modify if the variable is declared as final
        t.display();

    }
}
*/