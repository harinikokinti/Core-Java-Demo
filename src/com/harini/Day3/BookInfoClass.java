package com.harini.Day3;

class Book {
    public String title;
    public String author;
    public int price;

    public void printBookInfo() {
        System.out.println("Book: Title= " + title + ", Author= " + author + ", Price=" + price);
    }
}

public class BookInfoClass {
    public static void main(String[] args) {
        Book bookObj = new Book();
        bookObj.title = "Java";
        bookObj.author = "Mark Smith";
        bookObj.price = 100;

        Book bookObj2 = new Book();
        bookObj2.title = "HTML";
        bookObj2.author = "CHARLES";
        bookObj2.price = 300;

        bookObj.printBookInfo();
        bookObj2.printBookInfo();

    }
}
