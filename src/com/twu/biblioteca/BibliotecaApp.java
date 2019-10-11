package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        Book book1 = new Book("PDG", "Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book2 = new Book("CR", "The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book3 = new Book("OR", "On the Road", "Jack Kerouac", 1957);
        List<String> bookListString = Arrays.asList(book1.bookString(), book2.bookString(), book3.bookString());
        List<Book> bookList = Arrays.asList(book1, book2, book3);

        System.out.println("");
        System.out.println("List of options:");
        System.out.println("Type 0 and press enter to... quit the application. ");
        System.out.println("Type 1 and press enter to... display a list of books in the library. ");


//      handles only ints as valid inputs
        while (!sc.hasNextInt()) {
            System.out.println("Please select a valid option!");
            sc.next();
        }


        while (true) {
            int userInput = sc.nextInt();
            if (userInput == 0) {
                System.out.println("Exiting now...");
                System.exit(0);
            } else if (userInput == 1) {
                System.out.println("Here is a list of books in the library: ");
                for (String item : bookListString) {
                    System.out.println(item);
                }
                menuTwo(bookList);
                System.out.println("");
                System.out.println("List of options:");
                System.out.println("Type 0 and press enter to... quit the application. ");
                System.out.println("Type 1 and press enter to... display a list of books in the library. ");
//
            }


//                for (int i = 0; i <
//                        bookList.size(); i++) {
//                    String userBookID = sc.next();
//                    if (bookList.get(i).ID == userBookID) {
//                        System.out.println(bookList.get(i));
//                        System.out.println("Thank you! Enjoy the book");
//                    } else {
//                        System.out.println("Please select a valid option!");
//                    }
//                }


        }

    }

    public static void menuTwo(List<Book> bookList) {
        Scanner sc = new Scanner(System.in);
        String userBookID = sc.next();

        Boolean notExit = Boolean.TRUE;
        Boolean notFound = Boolean.TRUE;
        while (notExit) {
            for (int i = 0; i < bookList.size(); i++) {
                if (userBookID.equals((bookList.get(i)).ID)) {
                    System.out.println("Thank you! Enjoy the book");
                    return;
                }
            }


            System.out.println("Sorry, that book is not available");
            userBookID = sc.next();

            }
        }
    }

