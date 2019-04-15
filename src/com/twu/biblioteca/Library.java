package com.twu.biblioteca;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books = new HashMap<String, Book>();

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void printBooks() {
        //print books that are checkedin
        for (String isbn : books.keySet()) {
            if (books.get(isbn).getCheckedIn() == true) {
                System.out.printf("%-10s %-10s %-10s %10s \n", isbn, books.get(isbn).getTitle(), books.get(isbn).getAuthor(), books.get(isbn).getYear());
            }
        }
    }

    public void checkout(String isbn) {
        Book book = books.get(isbn);
        book.setCheckedIn(false);
        books.put(isbn, book);
        
    }
}
