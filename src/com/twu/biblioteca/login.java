package com.twu.biblioteca;

import java.util.*;

public class login {
    static Scanner sc = new Scanner(System.in);

    public static void loginMenu() {
        new userList().userList();
        System.out.println("Biblioteca login page ");
        System.out.println("------------------------------\n");
        System.out.println("Please enter your username: ");
        String username = sc.nextLine();
//        System.out.println(userList.getUserList());
        for (int i = 0; i < userList.getUserList().size(); i++) {
            if (username.equals(userList.getUserList().get(i).username)) {
                System.out.println("Please enter your password: ");
                String password = sc.nextLine();
                if (password.equals(userList.getUserList().get(i).password)) {
                    if (information(userList.getUserList().get(i).username) == 1){
                        System.out.println("\nEmail address: " + userList.getUserList().get(i).email);
                        System.out.println("Phone number: " + userList.getUserList().get(i).phone + "\n");
                    } else {
                        break;
                    }

//                    break;
                } else {
                    System.out.println("Incorrect password. Please login again. \n");
                    loginMenu();
                }
                break;
            } else {
                System.out.println("Username not found. Please try again.\n");
                loginMenu();
            }
            break;
        }
    }

    public static int information(String user){
        System.out.println("Type 1 and press enter to... view your information and continue to Biblioteca.");
        System.out.println("Type 2 and press enter to... continue to Biblioteca.");
        int input = sc.nextInt();
        return input;
    }
}
