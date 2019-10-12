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
            doUserInput(userInput);
        }
    }

    public static String printMenu() {
        String optionExit, optionListBooks, menu;
        optionExit = "Type 0 and press enter to... exit.\n";
        optionListBooks = "Type 1 and press enter to... display a list of books available in the library.";
        menu = optionExit + optionListBooks;
        return menu;
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

    public static void doUserInput(int userInput){
        if(userInput == 1){
            System.out.println("Here is a list of books available in the library:");
            bookList.printBookList();
        } else if (userInput == 0){
            exit = true;
        }
    }
}
