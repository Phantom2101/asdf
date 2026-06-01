package com.devops;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Tests for HelloWorld Application
 */
public class HelloWorldTest {
    
    /**
     * Test if HelloWorld object can be created
     */
    @Test
    public void testHelloWorldCreation() {
        HelloWorld app = new HelloWorld();
        assertNotNull("HelloWorld instance should not be null", app);
    }
    
    /**
     * Test getMessage method returns correct message
     */
    @Test
    public void testGetMessage() {
        HelloWorld app = new HelloWorld();
        String message = app.getMessage();
        assertNotNull("Message should not be null", message);
        assertTrue("Message should contain 'Maven'", message.contains("Maven"));
    }
    
    /**
     * Test message is not empty
     */
    @Test
    public void testMessageNotEmpty() {
        HelloWorld app = new HelloWorld();
        String message = app.getMessage();
        assertFalse("Message should not be empty", message.isEmpty());
        assertTrue("Message length should be greater than 0", message.length() > 0);
    }
}