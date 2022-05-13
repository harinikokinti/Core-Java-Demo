package com.harini.Day2;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}


// pgm 2
class ForLoop2 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

    }
}

// pgm 3

class ForLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--)   // here j>i is important to remember
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
o/p:
54321
5432
543
54
5
 */

// pgm 4
class ForLoop4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();

        }
    }
}
/*
o/p:
1
12
123
1234
 */

// pgm 5
class ForLoop5 {
    public static void main(String[] args) {
        int i, j, row = 6;

        for (i = 0; i < row; i++)
        {

            for (j = 2 * (row - i); j >= 0; j--)
            {

                System.out.print(" ");
            }

            for (j = 0; j <= i; j++)
            {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//pgm 6

class ForLoop6 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
        {
            for(int j=5; j>i; j--) {
                System.out.println(j);
            }

        }
    }
}