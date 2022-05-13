package com.harini.Day3;

class Student {
    public Student() {
        System.out.println("1st Constructor -  default");
    }

    public Student(int a) {  // with parameter
        System.out.println("2nd Constructor ");
    }


    public Student(String a) { // with diff datatype parameter
        System.out.println("3rd Constructor ");
    }


    public Student(int a, String b) { // with diff number of parameters
        System.out.println("4th Constructor ");
    }


    public Student(String b, int a) { // with diff order of parameters
        System.out.println("5th Constructor ");
    }

}

public class ConstructorRules {
    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student(5);
        Student student3 = new Student("Harini");
        Student student4 = new Student(5,"Harini");
        Student student5 = new Student("Harini", 5);


    }
}
