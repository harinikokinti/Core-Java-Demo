package com.harini.Day4;
/*
Inheritance:
DRY - Dont Repeat yourself

> It is a mechanism of consuming members of one class in another class by eastablishing parent and child
  relationship between the classes
> it encourages the code reusability
> we have relation between the class using extend keyword

Employee   -> Parent / base / super
FullTimeEmployee -> child / derived / sub

> in inheritence child class can consume members of its parent class as it is the owner of those members
except private members of the parent class
> Parent class constructor must be accessible to the child class otherwise inheritence will not be possible
> in inheritence child class can access parent class members but parent class cannot access any member of the
  child class

# Advantages
- code resuablity
- reduce error
- reduce time
- more maintable code


# Type of inheritence
1. Simple
2. Multi-Level
3. Hirarchical
4. Multiple
5. Hybrid
 */

class Employee {
    public int empId;
    public String firstName;
    public String lastName;
    public String email;

}

class FullTimeEmployee extends Employee{
    public int annualSalary;

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

}

class PartTimeEmployee extends Employee{
    public int hourSalary;

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Abdul";
        fte.lastName = "Kalam";

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Alluri";
        pte.lastName = "SitaRama";

        fte.getFullName();
        pte.getFullName();

    }
}
