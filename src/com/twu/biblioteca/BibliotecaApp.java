package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        String book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890).bookString();
        String book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951).bookString();
        String book3 = new Book("On the Road", "Jack Kerouac", 1957).bookString();
        List<String> bookList = Arrays.asList(book1, book2, book3);
//        to print bookList
//        for (String item : bookList) {
//            System.out.println(item);
//        }
        System.out.println("");
        System.out.println("List of options:");
        System.out.println("Type 0 and press enter to... if you want to quit. ");
        System.out.println("Type 1 and press enter to... display a list of books in the library. ");

        int userInput;
        while (true) {
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            if (userInput == 0) {
                System.out.println("Exiting now...");
                break;
            } else if (userInput != 1) {
                System.out.println("Please select a valid option!");
            } else {
                System.out.println(userInput);
                break;
            }
        }


    }
}
