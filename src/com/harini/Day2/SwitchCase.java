package com.harini.Day2;
// To execute single statement  from multiple conditions

public class SwitchCase {
    public static void main(String args[]) {
        int number = 4;
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("threee");
                break;
            default:
                System.out.println("Not in the list");
        }
    }
}

// Exmaple 2
class SwitchCase2 {
    public static void main(String args[]) {
        String number = "two";
        switch (number) {
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            default:
                System.out.println("No number in this list");
        }
    }

}