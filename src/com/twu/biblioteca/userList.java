package com.twu.biblioteca;

import java.util.*;

public class userList {
    public static ArrayList<user> userList = new ArrayList<user>();

    public static ArrayList<user> userList() {
        user user1 = new user("Deedee", "pw1", "123-4567", "deedee@biblio.com", "0431281621");
        user user2 = new user("person1", "pw2", "123-1111","p1@biblio.com", "0412345678");
        user user3 = new user("Alien", "pw3", "123-2222","alien@biblio.com", "0400000000");
        user user4 = new user("Laptop", "pw4", "123-3333","laptop@biblio.com", "0411111111");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return userList;
    }

    public static ArrayList<user> getUserList() {
        return userList;
    }

}
