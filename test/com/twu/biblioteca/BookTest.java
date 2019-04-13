package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testBook() {
        Book book = new Book("Book 1", "Jane Doe", "2001");
        String title = book.getTitle();
        String author = book.getAuthor();
        String year = book.getYear();

        assertEquals("Book 1", title);
        assertEquals("Jane Doe", author);
        assertEquals("2001", year);

    }
}
