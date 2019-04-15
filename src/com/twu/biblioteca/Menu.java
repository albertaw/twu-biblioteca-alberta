package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private boolean running = true;
    private String message = "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!";
    private ArrayList<String> options = new ArrayList<String>(Arrays.asList("View books", "Checkout a book", "Quit"));
    private Library library = new Library();

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void printOptions() {
        System.out.println("Menu");
        for(String option : options) {
            System.out.println(options.indexOf(option) +  " " + option);
        }
    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void selectOption(String option) {
        if (option.equals("0")) {
            library.printBooks();
        } else if (option.equals("1")) {
            System.out.println("Enter a book isbn");
            String isbn = getInput();
            library.checkout(isbn);
        } else if (option.equals("2")) {
            System.out.println("Goodby");
            running = false;
        } else {
            System.out.println("Please select a valid option!");
        }
    }

    public void init() {
        System.out.println(message);

        HashMap<String, Book> books = library.getBooks();
        books.put("1111", new Book("Title 1", "Author 1", "Year 1"));
        books.put("2222", new Book("Title 2", "Author 2", "Year 2"));
        books.put("3333", new Book("Title 3", "Author 3", "Year 3"));

        while(running) {
            printOptions();
            System.out.println("Choose an option");
            String option = getInput();
            selectOption(option);
        }
    }

}
