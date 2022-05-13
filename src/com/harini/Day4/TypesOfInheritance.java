package com.harini.Day4;
/*
Realtime EXample
1. Single Inheritance:  Parent and Child
2. Multi Level: Parent -> Child -> Grand Child
3. Hierarchical : Parent -> Child1
               Parent -> Child2
   siblings can have same parent
4. Multiple : A child cannot have multiple parents , not possible in JAva
5. Hybrid : Hierarchical + Multiple ( not possible in Java)

 */

// single
class A {
public void test1() {
    System.out.println("test1 method");
}
}

class B extends A {
    public void test2() {
        System.out.println("test2 method");
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {
        A a = new A();
        a.test1();
        //a.test2();//  parent class cannot access child class method

        B b = new B();
        b.test2();
        b.test1();


    }
}

// Multi level

class A1 {
    public void test1() {
        System.out.println("test1 method");
    }
}

class B1 extends A1 {
    public void test2() {
        System.out.println("test2 method");
    }
}

class C1 extends B1 {
    public void test3() {
        System.out.println("test3 method");
    }
}

 class MultiLevelInheritance {
    public static void main(String[] args) {
        A1 a = new A1();
        a.test1();
        //a.test2();// parent class cannot access child class method
       // a.test3(); // parent class cannot access grand child class method

        B1 b = new B1();
        b.test2();
        b.test1();

        C1 c = new C1();
        c.test3();
        c.test1();
        c.test2();

    }
}

// Hierachical
class A2 {
    public void test1() {
        System.out.println("test1 method");
    }
}

class B2 extends A2 {
    public void test2() {
        System.out.println("test2 method");
    }
}

class C2 extends A2 {
    public void test3() {
        System.out.println("test3 method");
    }
}

 class HierarchicalInheritance {
    public static void main(String[] args) {
        A2 a = new A2();
        a.test1();
        //a.test2();//  parent class cannot access child class method
        //a.test3(); //  parent class cannot access child class method

        B2 b = new B2();
        b.test2();
        b.test1();

        C2 c = new C2();
        c.test1();
        c.test3();
    }
}





// Multiple



//Hybrid