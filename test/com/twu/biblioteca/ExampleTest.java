package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testMessage() {
        String message = new Library().message;
        assertEquals(message, "Welcome to Biblioteca");
    }
}
