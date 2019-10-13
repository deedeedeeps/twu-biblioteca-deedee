package com.twu.biblioteca;

import java.util.*;

public class movieList {
    public static ArrayList<movie> movieList = new ArrayList<movie>();

    public static ArrayList<movie> movieList() {
        movie movie1 = new movie("The Terminal", "Steven Spielberg", 2004, "8");
        movie movie2 = new movie("Aladdin", "Ron Clements & John Musker ", 1992, "8");
        movie movie3 = new movie("Man on Fire", "Tony Scott", 2004, "5");
        movie movie4 = new movie("Life", "Deedee", 2019, "10");

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        return movieList;
    }

    public static void printMovieList() {
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("--> " + movieList.get(i).movieString());
        }
    }


    public static ArrayList<movie> getMovieListList() {
        return movieList;
    }
}
