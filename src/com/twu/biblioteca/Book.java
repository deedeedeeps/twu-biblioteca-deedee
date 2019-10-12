package com.twu.biblioteca;

public class Book {
    public String author;
    public String title;
    public int year;

    public Book(String title, String author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String bookString(){
        String printBookString =  title + " by " + author + ", published in " + year +".";
        return printBookString;
    }
}
