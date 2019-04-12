package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testMessage() {
        String message = new Library().message;

        assertEquals(message, "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!");
    }

    @Test
    public void testView() {
        String libraryBooks[] = new Library().books;

        String books[] = new String[3];
        books[0] = "Book 1";
        books[1] = "Book 2";
        books[2] = "Book 3";

        assertArrayEquals(books, libraryBooks);
    }
}
