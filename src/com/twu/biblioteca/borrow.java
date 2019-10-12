package com.twu.biblioteca;

import java.util.*;

public class borrow {
    private static ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public static String sucessOrNot(String success) {
        String message;
        if (success.equals("TRUE")) {
            message = "Thank you! Enjoy the book.";
        } else {
            message = "Sorry, that book is not available.";
        }
        return message;
    }

    public static String borrowBook(String userInputTitle, ArrayList<Book> availableList) {
        boolean available = true;
        String availableOrNot;
        for (int i = 0; i < availableList.size(); i++) {
            if (availableList.get(i).title.equals(userInputTitle)) {
                borrowedBooks.add(availableList.get(i));
                availableOrNot = sucessOrNot("TRUE");
                availableList.remove(i);
                available = false;
                System.out.println(availableOrNot);
                break;
            } if(!available){
                availableOrNot = sucessOrNot("FALSE");
                System.out.println(availableOrNot);
            }
        } return "HI";
    }

    public static boolean bookAvailability(String input, ArrayList<Book> bookList){
        boolean available = true;
        for (int i = 0; i<bookList.size();i++){
            if(bookList.get(i).title.equals(input)){
                available = false;
                break;
            } else{
                available = true;
            }
        } return available;
    }
}
