package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MenuTest {
    @Test
    public void testMessage() {
        String message = new Menu().getMessage();

        assertEquals(message, "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!");
    }

    @Test
    public void testGetMenuOptions() {
        Menu menu = new Menu();
        ArrayList<String> options = menu.getOptions();
        ArrayList<String> expectedOptions = new ArrayList<String>(Arrays.asList("View books"));

        assertThat(expectedOptions, equalTo(options));
    }

}
