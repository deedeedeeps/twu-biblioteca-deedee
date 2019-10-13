package com.twu.biblioteca;

import java.util.*;

public class menu {
    static boolean quit;
    static Scanner sc = new Scanner(System.in);
    static String invalid = "Please select a valid option!";
    static String quitStr = "Quitting the app now...";

    /* Displays the initial menu for users to either quit or display list of books.*/
    public static String dispMenu1() {
        new bookList().bookList();
        while (!quit) {
            String option1, option2, options;
            option1 = "Type 0 and press enter to... quit the app.\n";
            option2 = "Type 1 and press enter to... display a list of books.\n";
            options = option1 + option2;
            System.out.println(options);

            int userInput1 = getPosInt();
            if (userInput1 == 0 || userInput1 == 1) {
                doUserInput1(userInput1);
            } else {
                System.out.println(invalid);
                dispMenu1();
            }
        } return "HI";
    }

    /* Handles user input to be only positive integers */
    public static int getPosInt() {
        int userInput = 0;
        try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(invalid);
            dispMenu1();
        }
        return userInput;
    }

    /* Displays a list of available and unavailable books*/
    public static void doUserInput1(int userInput1) {
        if (userInput1 == 1) {
            System.out.println("_____________________________________________");
            System.out.println("Here is a list of available books:");
            bookList.printBookList();
            System.out.println("_____________________________________________");
            System.out.println("\nHere is a list of unavailable books:");
            for (int i = 0; i < borrow.getBorrowedList().size(); i++) {
                System.out.println("--> " + borrow.getBorrowedList().get(i).title);
            }
            if (borrow.getBorrowedList().size() == 0) {
                System.out.println("--> All books are available in the library! ");
            }
            System.out.println("_____________________________________________");

            /* Displays the second menu with the options of returning or borrowing*/
            dispMenu2();

            /* Processes the second userInput and either goes into the borrowing/returning option */
            int userInput2 = getPosInt();
            if (userInput2 == 1 || userInput2 == 2) {
                Output2(userInput2);
            } else {
                Output2(userInput2);
                System.out.println(invalid);
            }
        } else if (userInput1 == 0) {
            System.out.println(quitStr);
            quit = true;
        }
    }

    /* Displayed after the user presses 1 from the first menu function*/
    public static void dispMenu2() {
        System.out.println("\nType 0 and press enter to... quit the app.");
        System.out.println("Type 1 and press enter to... borrow a book.");
        System.out.println("Type 2 and press enter to... return a book.");
    }

    /* Processes the book to either be borrowed or returned */
    public static void Output2(int userInput) {

        String borrowStr = "\nType the title of the book that you would like to borrow and press enter.";
        String returnStr = "\nType the title of the book that you would like to return and press enter.";

        if (userInput == 1) { /* Borrow a book */
            System.out.println(borrowStr);
            System.out.println(borrow.borrowBook(bookList.getBookList(), getUserBookInput()));
        } else if (userInput == 2) { /* Return a book */
            System.out.println(returnStr);
            System.out.println(returnItem.ReturnBook(borrow.getBorrowedList(), bookList.getBookList(),getUserBookInput()));
        } else if (userInput == 0) { /* Quit the app */
            System.out.println(quitStr);
            System.exit(0);
        }
    }

    /* Gets string of book title to either be borrowed or returned */
    public static String getUserBookInput() {
        String userInput;
        userInput = sc.nextLine();
        return userInput;
    }
}