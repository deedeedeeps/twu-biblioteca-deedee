package com.twu.biblioteca;

public class movie {
    public String name;
    public String director;
    public int year;
    public String rating;

    public movie(String name, String director, int year, String rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String movieString() {
        String printMovieString = name + " directed by " + director + ", released in " + year + "." + "\n\t\tRating = " + rating + ".\n";
        return printMovieString;
    }
}
