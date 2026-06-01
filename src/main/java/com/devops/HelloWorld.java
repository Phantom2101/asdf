package com.devops;

/**
 * Simple Hello World Application
 * Demonstrates Maven project structure and lifecycle
 */
public class HelloWorld {
    
    /**
     * Main method - entry point of application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   Welcome to Maven Hello World Project");
        System.out.println("==========================================");
        System.out.println("Message: Hello Maven!");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("==========================================");
        
        // Create instance and call method
        HelloWorld app = new HelloWorld();
        System.out.println(app.getMessage());
    }
    
    /**
     * Returns a greeting message
     * @return greeting string
     */
    public String getMessage() {
        return "This is a sample message from Maven application!";
    }
}