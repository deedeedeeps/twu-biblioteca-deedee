package com.twu.biblioteca;

public class Book {
    public String ID;
    public String author;
    public String title;
    public int year;

    public Book(String ID, String title, String author, int year) {
        this.ID = ID;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String bookString(){
        String printBookString = "Book ID " + ID + ": " + title + " by " + author + ", published in " + year +".";
        return printBookString;
    }
}
