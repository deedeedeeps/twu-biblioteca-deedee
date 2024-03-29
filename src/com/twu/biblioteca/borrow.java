package com.twu.biblioteca;

import java.util.ArrayList;

public class borrow {

    /* Returns "book available or not" messsage */
    public static String availableOrNot(String TRUE) {
        String availbleOrNotFeedback;
        if (TRUE.equals("TRUE")) {
            availbleOrNotFeedback = "Thank you! Enjoy the book.\n";
        } else if (TRUE.equals("TRUEMOVIE")) {
            availbleOrNotFeedback = "Thank you! Enjoy the movie.\n";
        } else if (TRUE.equals("FALSEMOVIE")) {
            availbleOrNotFeedback = "Thank you! Enjoy the movie.\n";
        } else {
            availbleOrNotFeedback = "Sorry that book is not available.\n";
        }
        return availbleOrNotFeedback;
    }

    /* Initialize a borrowedList of borrowed books */
    public static ArrayList<Book> borrowedList = new ArrayList<Book>();
    public static ArrayList<movie> borrowedMovieList = new ArrayList<movie>();

    /* And returns it */
    public static ArrayList<Book> getBorrowedList() {
        return borrowedList;
    }

    public static ArrayList<movie> getMovieList() {
        return borrowedMovieList;
    }

    /* Checks to see if a book is available to be borrowed */
    public static String borrowBook(ArrayList<Book> availableList, String userBook) {
        boolean available = false;
        String successOrNot = "";
        /* Iterates over available list to see if the book the user wants is available */
        for (int i = 0; i < availableList.size(); i++) {
            if (availableList.get(i).title.equals(userBook)) {
                successOrNot = availableOrNot("TRUE");
                borrowedList.add(availableList.get(i));
                availableList.remove(i);
                available = true;
                break;
            }
        } /* If it is not available display the unavailable message and start over */
        if (available == false) {
            successOrNot = availableOrNot("FALSE");
        }
        return successOrNot;
    }

    public static String borrowMovie(ArrayList<movie> availableList, String userMovie) {
        boolean available = false;
        String successOrNot = "";
        /* Iterates over available list to see if the book the user wants is available */
        for (int i = 0; i < availableList.size(); i++) {
            if (availableList.get(i).name.equals(userMovie)) {
                successOrNot = availableOrNot("TRUEMOVIE");
                borrowedMovieList.add(availableList.get(i));
                availableList.remove(i);
                available = true;
                break;
            }
        } /* If it is not available display the unavailable message and start over */
        if (available == false) {
            successOrNot = availableOrNot("FALSE");
        }
        return successOrNot;
    }

}
