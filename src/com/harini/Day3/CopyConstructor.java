package com.harini.Day3;

class Car {
    public String brand;
    public int year;
    public String model;
    public String color;
    public int price;

    public Car(String brand, int year, String model, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(Car car) {
        this.brand = car.brand;
        this.color = car.color;
        this.model = car.model;
        this.year = car.year;
        this.price = car.price;
    }

    public Car(Car car, String model, int price) {
        this.brand = car.brand;
        this.color = car.color;
        this.model = model;
        this.year = car.year;
        this.price = price;
    }

    public void display() {
        System.out.println("Car details: " + brand + " , " + color + ", " + model + ", " + year + ", " + price);
    }

}

public class CopyConstructor {
    public static void main(String[] args) {

        Car car = new Car("Nexon",2022,"Tata", "Grey",1300000);
        Car car2 = new Car(car); // copy the constuctor details from car to car2
        Car car3 = new Car(car2,"EV Tata" ,1500000); //  copy the consturctor details of car2 nto car3 and also can change the variable values

        car.display();
        car2.display();
        car3.display();

    }
}
