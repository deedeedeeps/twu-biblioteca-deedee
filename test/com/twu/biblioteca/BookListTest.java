package com.twu.biblioteca;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BookListTest {
    @Test
    public void BookListTitle() {
        Book bookTest = new Book("BookTitle", "BookAuthor", 1111);
        assertEquals(bookTest.title, "BookTitle");
    }

    @Test
    public void BookListAuthor() {
        Book bookTest = new Book("BookTitle", "BookAuthor", 1111);
        assertEquals(bookTest.author, "BookAuthor");
    }

    @Test
    public void BookListYear() {
        Book bookTest = new Book("BookTitle", "BookAuthor", 1111);
        assertEquals(bookTest.year, 1111);
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }
}





