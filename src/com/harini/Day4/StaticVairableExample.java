package com.harini.Day4;

class Student {
    public int id;
    public String studentName;
    static public String schoolName  = "ABC SCHOOL";
}
public class StaticVairableExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.studentName = "Harini";

        Student s2 = new Student();
        s2.id = 102;
        s2.studentName = "Mamatha";

        System.out.println("Student details: " +  + s.id + " " + s.studentName + " "  + Student.schoolName  );
        System.out.println("Student details: " +  + s2.id + " " + s2.studentName + " "  + Student.schoolName  );
    }
}
