package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

       Library library = new Library();
       //TODO: create getter for message in Menu
       System.out.println(library.message);
       Menu menu = new Menu();
       menu.printOptions();
       int option = menu.getInput();
       menu.selectOption(option);
    }
}
