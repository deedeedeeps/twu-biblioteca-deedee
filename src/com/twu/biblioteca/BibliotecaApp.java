package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        login.loginMenu();
        System.out.println(returnsWelcome());
        menu.dispMenu1();
    }

    public static String returnsWelcome(){
        String welcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcome;
    }

}