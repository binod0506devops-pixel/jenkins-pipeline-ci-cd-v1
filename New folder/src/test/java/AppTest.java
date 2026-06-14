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
}