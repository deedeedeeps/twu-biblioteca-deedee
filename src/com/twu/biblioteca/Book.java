package com.twu.biblioteca;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String title, String author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String bookString(){
        String printBookString = title + " by " + author + " published in " + year;
        return printBookString;
    }
}
