package com.twu.biblioteca;
import java.util.*;

public class bookList {
    public static ArrayList<Book> bookList = new ArrayList<Book>();

    public static ArrayList<Book> bookList(){
        Book book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book3 = new Book("On the Road", "Jack Kerouac", 1957);
        Book book4 = new Book("A", "B", 1111);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        return bookList;
    }

    public static void printBookList(){
        for(int i=0; i<bookList.size(); i++){
            System.out.println("--> "+bookList.get(i).bookString());
        }
    }


    public static ArrayList<Book> getBookList(){
        return bookList;
    }
}
