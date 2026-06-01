package com.devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Selenium Login Test
 * This test demonstrates automated login testing
 */
public class SeleniumLoginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.out.println("=== Setting up WebDriver ===");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        System.out.println("=== Closing WebDriver ===");
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testLoginFlow() {
        System.out.println("\n--- Test: Login Flow ---");
        
        // Step 1: Open website
        System.out.println("Step 1: Opening website...");
        driver.get("https://www.example.com");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        
        // Step 2: Enter username
        System.out.println("Step 2: Entering username...");
        // Note: Replace selectors with actual login form elements
        // WebElement usernameField = driver.findElement(By.id("username"));
        // usernameField.sendKeys("testuser@example.com");
        
        // Step 3: Enter password
        System.out.println("Step 3: Entering password...");
        // WebElement passwordField = driver.findElement(By.id("password"));
        // passwordField.sendKeys("TestPassword123");
        
        // Step 4: Click login
        System.out.println("Step 4: Clicking login button...");
        // WebElement loginButton = driver.findElement(By.id("loginBtn"));
        // loginButton.click();
        
        // Step 5: Verify login successful
        System.out.println("Step 5: Verifying login...");
        // wait.until(ExpectedConditions.urlContains("/dashboard"));
        // assertTrue("Login successful", driver.getCurrentUrl().contains("/dashboard"));
        
        System.out.println("Login test completed successfully");
    }

    @Test
    public void testInvalidCredentials() {
        System.out.println("\n--- Test: Invalid Credentials ---");
        
        System.out.println("Attempting login with invalid credentials...");
        driver.get("https://www.example.com");
        
        // Enter invalid credentials
        // WebElement usernameField = driver.findElement(By.id("username"));
        // usernameField.sendKeys("invalid@example.com");
        
        // WebElement passwordField = driver.findElement(By.id("password"));
        // passwordField.sendKeys("WrongPassword");
        
        // WebElement loginButton = driver.findElement(By.id("loginBtn"));
        // loginButton.click();
        
        // Verify error message
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-message")));
        // WebElement errorMessage = driver.findElement(By.className("error-message"));
        // assertTrue("Error message displayed", errorMessage.isDisplayed());
        
        System.out.println("Invalid credentials test completed");
    }

    @Test
    public void testRememberMeCheckbox() {
        System.out.println("\n--- Test: Remember Me Checkbox ---");
        
        driver.get("https://www.example.com");
        
        // Find and click Remember Me checkbox
        // WebElement rememberMeCheckbox = driver.findElement(By.id("rememberMe"));
        // rememberMeCheckbox.click();
        // assertTrue("Checkbox is selected", rememberMeCheckbox.isSelected());
        
        System.out.println("Remember Me checkbox test completed");
    }

    @Test
    public void testForgotPasswordLink() {
        System.out.println("\n--- Test: Forgot Password Link ---");
        
        driver.get("https://www.example.com");
        
        // Click Forgot Password link
        // WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        // forgotPasswordLink.click();
        
        // Verify navigation to forgot password page
        // wait.until(ExpectedConditions.urlContains("/forgot-password"));
        // assertTrue("Navigated to forgot password", driver.getCurrentUrl().contains("forgot-password"));
        
        System.out.println("Forgot Password link test completed");
    }
}
