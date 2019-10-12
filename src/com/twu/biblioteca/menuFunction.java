package com.twu.biblioteca;

import java.text.NumberFormat;
import java.util.*;

public class menuFunction {
    static boolean exit;
    static String invalidInput = "Please select a valid option!";

    public static void menuFunction() {
        while (!exit) {
            System.out.println(printMenu());
            int userInput = getUserInput();
            choice1(userInput);
        }
    }

    public static String printMenu() {
        String optionExit, optionListBooks, menu;
        optionExit = "Type 0 and press enter to... exit.\n";
        optionListBooks = "Type 1 and press enter to... display a list of books available in the library.";
        menu = optionExit + optionListBooks;
        return menu;
    }

    public static void printMenu2(){
        System.out.println("Type 2 and press enter to... borrow a book");
        System.out.println("Type 3 and press enter to... return a book");
    }

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int userInput = -1;
        try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please select a valid option! \n");
            menuFunction();
        }
        return userInput;
    }

    public static String userBookInput(){
        Scanner sc = new Scanner(System.in);
        String userInput;
        userInput = sc.nextLine();
        return userInput;
    }

    public static void choice1(int userInput){
        if(userInput == 1){
            System.out.println("Here is a list of books available in the library:");
            bookList.printBookList();
            printMenu2();
            choice2(getUserInput());
        } else if (userInput == 0){
            exit = true;
        }
    }

    public static void choice2(int userInput){
        if (userInput ==2){
            System.out.println("Enter the name of the book you would like to borrow");
            System.out.println(borrow.borrowBook(userBookInput(), bookList.bookList()));
        } else if (userInput == 3){
            System.out.println("Enter the name of the book you would like to return. ");
        }
    }
}
