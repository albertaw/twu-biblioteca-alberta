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

    public int getInput() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public boolean validateOption(String input) {
        return true;
    }

    public void selectOption(int option) {

        switch (option) {
            case 0: library.printBooks();
        }
    }

}
