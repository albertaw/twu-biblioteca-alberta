package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class LibraryTest {

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
    public void testBooksShouldListBooks() {
        Book libraryBooks[] = new Library().books;
        Book book = libraryBooks[0];
        String title = book.getTitle();
        String author = book.getAuthor();
        String year = book.getYear();

        assertEquals("Title 1", title);
        assertEquals("Author 1", author);
        assertEquals("Year 1", year);
    }

    @Test
    public void testBooksShouldReturnBooksLength() {
        Book books[] = new Library().books;
        int length = books.length;

        assertEquals(3, length);
    }

}
