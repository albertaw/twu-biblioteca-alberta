package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class LibraryTest {
    Library library;
    HashMap<String, Book> books;

    @Before
    public void setUp() {
        library = new Library();
        books = library.getBooks();
        books.put("1111", new Book("Title 1", "Author 1", "Year 1"));
        books.put("2222", new Book("Title 2", "Author 2", "Year 2"));
        books.put("3333", new Book("Title 3", "Author 3", "Year 3"));
    }

    @Test
    public void testBooksShouldListBooks() {
        Book book = books.get("1111");
        String title = book.getTitle();
        String author = book.getAuthor();
        String year = book.getYear();

        assertEquals("Title 1", title);
        assertEquals("Author 1", author);
        assertEquals("Year 1", year);
    }

    @Test
    public void testBooksShouldReturnBooksLength() {
        int length = books.size();

        assertEquals(3, length);
    }

    @Test
    public void testCheckingOutBooks() {
      Book book = books.get("1111");
        library.checkout("1111");
        assertEquals(false, book.getCheckedIn());
    }

}
