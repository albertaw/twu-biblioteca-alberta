package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> options = new ArrayList<String>(Arrays.asList("View books"));
    private Library library = new Library();

    public ArrayList<String> getOptions() {
        return this.options;
    }

    public void printOptions() {
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

        if (option == "0") {
            library.printBooks();
        } else {
            System.out.println("Please select a valid option!");
        }
    }

}
