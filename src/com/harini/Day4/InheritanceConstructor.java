package com.harini.Day4;
/*
-- The Parent constructor must be accessible to the child for Inheritance to happen
-- the Parent class cannot access child class construcot or any method in it

 */

class Parent {
    public Parent(int a) {
        System.out.println("Parent Constructor : " + a);
    }
    public void parentMethod() {
        System.out.println("Parent Method");
    }

}


class Child extends Parent {

    public Child(int a) {
        super(a);  // must call the parent  constructor , pass the arugument , super to access the parent member
        System.out.println("Child Constructor : " + a);
    }

    public void childMethod() {
        System.out.println("Child Method");
    }
}


public class InheritanceConstructor {
    public static void main(String[] args) {

        Child c = new Child(100);  // the child constructor alone can run both parent and child constructors
        c.childMethod();
        c.parentMethod();

        Parent p = new Parent(50);
        p.parentMethod();
       // p.childMethod();  // cannot access the child method

    }
}
