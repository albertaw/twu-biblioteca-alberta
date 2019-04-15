package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private boolean running = true;
    private String message = "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!";
    private ArrayList<String> options = new ArrayList<String>(Arrays.asList("View books"));
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
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void selectOption(String option) {
        if (option.equals("0")) {
            library.printBooks();
        } else if (option.equals("1")) {
            System.out.println("Goodby");
            running = false;
        } else {
            System.out.println("Please select a valid option!");
        }
    }

    public void init() {
        System.out.println(message);
        while(running) {
            printOptions();
            String option = getInput();
            selectOption(option);
        }
    }

}
