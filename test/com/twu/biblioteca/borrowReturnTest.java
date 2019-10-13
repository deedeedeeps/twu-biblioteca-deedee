package com.twu.biblioteca;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class borrowReturnTest {

    @Test
    public void borrowSucessTest() {
        /* Success borrow (book available) */
        ArrayList<Book> allBooks = new ArrayList<Book>();

        Book book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book3 = new Book("On the Road", "Jack Kerouac", 1957);
        Book book4 = new Book("A", "B", 1111);
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);

        assertEquals(borrow.borrowBook(allBooks, "On the Road"), borrow.availableOrNot("TRUE"));

    }

    @Test
    public void borrowFailTest() {
        /* Fail borrow (book not available) */
        ArrayList<Book> allBooks = new ArrayList<Book>();

        Book book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book3 = new Book("On the Road", "Jack Kerouac", 1957);
        Book book4 = new Book("A", "B", 1111);
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);

        assertEquals(borrow.borrowBook(allBooks, "This book does not exist"), borrow.availableOrNot("FALSE"));

    }

    @Test
    public void returnSucessTest() {
        /* Sucess return */
        ArrayList<Book> available = new ArrayList<Book>();
        ArrayList<Book> unavailable = new ArrayList<Book>();
        Book book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book3 = new Book("On the Road", "Jack Kerouac", 1957);
        Book book4 = new Book("A", "B", 1111);
        available.add(book1);
        available.add(book2);
        unavailable.add(book3);

        assertEquals(returnItem.ReturnBook(unavailable, available, "On the Road"), returnItem.returnSucessOrNot("TRUE"));
    }

    @Test
    public void returnFailTest() {
        /* Sucess return */
        ArrayList<Book> available = new ArrayList<Book>();
        ArrayList<Book> unavailable = new ArrayList<Book>();
        Book book1 = new Book("Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book3 = new Book("On the Road", "Jack Kerouac", 1957);
        Book book4 = new Book("A", "B", 1111);
        available.add(book1);
        available.add(book2);
        unavailable.add(book3);

        assertEquals(returnItem.ReturnBook(unavailable, available, "Wrong Book"), returnItem.returnSucessOrNot("FALSE"));
    }
}
