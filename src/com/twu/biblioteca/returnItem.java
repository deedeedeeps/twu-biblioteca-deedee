package com.twu.biblioteca;

import java.util.ArrayList;

public class returnItem {

    /* Returns "book valid or not" messsage */
    public static String returnSucessOrNot(String TRUE) {
        String returnSucessOrNotFeedback;
        if (TRUE.equals("TRUE")) {
            returnSucessOrNotFeedback = "Thank you for returning the book.\n";
        } else if (TRUE.equals("TRUEMOVIE")) {
            returnSucessOrNotFeedback = "Thank you for returning the movie.\n";
        } else if (TRUE.equals("FALSEMOVIE")) {
            returnSucessOrNotFeedback = "That is not a valid movie to return.\n";
        } else {
            returnSucessOrNotFeedback = "That is not a valid book to return\n";
        }
        return returnSucessOrNotFeedback;
    }

    /* Checks to see if book can be returned and moves it back tot eh available book list */
    public static String ReturnBook(ArrayList<Book> borroewedBookList, ArrayList<Book> availableBookList, String input) {
        String returnMessage = "";
        boolean available = false;
        for (int i = 0; i < borroewedBookList.size(); i++) {
            if (borroewedBookList.get(i).title.equals(input)) {
                /* If the book title the user wants to borrow is in the borrowed list */
                returnMessage = returnSucessOrNot("TRUE");
                /* Add the book back to the list of all available books */
                availableBookList.add(borroewedBookList.get(i));
                /* Remove it from borrowed list */
                borroewedBookList.remove(i);
                available = true;
                break;
            }
        }
        if (!available) {
            returnMessage = returnSucessOrNot("FALSEBOOK");
        }
        return returnMessage;

    }

    public static String ReturnMovie(ArrayList<movie> borrowedMovieList, ArrayList<movie> availableMovieList, String input) {
        String returnMessage = "";
        boolean available = false;
        for (int i = 0; i < borrowedMovieList.size(); i++) {
            if (borrowedMovieList.get(i).name.equals(input)) {
                /* If the book title the user wants to borrow is in the borrowed list */
                returnMessage = returnSucessOrNot("TRUEMOVIE");
                /* Add the book back to the list of all available books */
                availableMovieList.add(borrowedMovieList.get(i));
                /* Remove it from borrowed list */
                borrowedMovieList.remove(i);
                available = true;
                break;
            }
        }
        if (!available) {
            returnMessage = returnSucessOrNot("FALSEMOVIE");
        }
        return returnMessage;

    }
};