package com.twu.biblioteca;

public class Library {
    public Book books[] = {
            new Book("Title 1", "Author 1", "Year 1"),
            new Book("Title 2", "Author 2", "Year 2"),
            new Book("Title 3", "Author 3", "Year 3")
    };

    public void printBooks() {
        for (Book book: books) {
            System.out.printf("%-35s %-25s %35s \n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
}
