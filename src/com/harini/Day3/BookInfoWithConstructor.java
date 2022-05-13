package com.harini.Day3;
/*
With Constructor
never give return type for a constructor
 */

class Book2 {
    public String title;
    public String author;
    public int price;

    public Book2(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void printBookInfo() {
        System.out.println("Book: Title= " + title + ", Author= " + author + ", Price=" + price);
    }
}


public class BookInfoWithConstructor {
    public static void main(String[] args) {
        Book2 bookObj = new Book2("Learn JAva" , "Mark Smith", 100);
        Book2 bookObj2 = new Book2("Learn HTML" , "Charles", 100);

        bookObj.printBookInfo();
        bookObj2.printBookInfo();

    }
}
