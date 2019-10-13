package com.twu.biblioteca;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class optionsTest {

    @Test
    public void dispWelcomeMessage() {
        String welcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(welcome, BibliotecaApp.returnsWelcome());
    }

}
