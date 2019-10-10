package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        String book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890).bookString();
        String book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951).bookString();
        String book3 =  new Book("On the Road", "Jack Kerouac", 1957).bookString();
        List<String> bookList = Arrays.asList(book1, book2, book3);
       for(String item: bookList){
           System.out.println(item);
       }
//        System.out.println(book3.bookString());
    }
}