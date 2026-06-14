package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGetMessage() {
        App app = new App();
        String message = app.getMessage();

        assertEquals("Hello, Jenkins!", message);
    }

    @Test
    public void testMessageNotNull() {
        App app = new App();

        String message = app.getMessage();

        assertNotNull(message);
    }

    @Test
    public void testMessageLength() {
        App app = new App();

        String message = app.getMessage();

        assertEquals(15, message.length());
    }

    @Test
    public void testMessageContainsJenkins() {
        App app = new App();

        String message = app.getMessage();

        assertTrue(message.contains("Jenkins"));
    }

    @Test
    public void testMessageStartsWithHello() {
        App app = new App();

        String message = app.getMessage();

        assertTrue(message.startsWith("Hello"));
    }

    @Test
    public void testMessageEndsWithExclamation() {
        App app = new App();

        String message = app.getMessage();

        assertTrue(message.endsWith("!"));
    }
}