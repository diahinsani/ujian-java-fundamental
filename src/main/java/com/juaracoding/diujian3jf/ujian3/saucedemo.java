package com.juaracoding.diujian3jf.ujian3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class saucedemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\MyTools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Open Browser");
        driver.get("https://www.saucedemo.com/");

        //negative
        login(driver,"", "");

        String txtInvalid = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        System.out.println(txtInvalid);

        customAssertEquals(txtInvalid, "Epic sadface: Username and password do not match any user in this service");

        //positive
        login(driver,"standard_user","secret_sauce");

        String txtProducts = driver.findElement(By.xpath("//span[@class='title']")).getText();
        System.out.println(txtProducts);

        customAssertEqualsOne(txtProducts, "Products");
        Utils.delay(4);

        driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
        Utils.delay(4);

        driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
        Utils.delay(4);

        String addToCart = driver.findElement(By.xpath("//button[@id='remove']")).getText();
        System.out.println("Add to cart");
        customAssertEqualsThree(addToCart,"Remove");

        Utils.delay(5);
        driver.quit();
        System.out.println("Quit Browser");

    }

    public static void customAssertEqualsThree(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

    public static void customAssertEqualsOne(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

    public static void customAssertEquals(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

    public static void login (WebDriver driver,String username, String password){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login-button']"));
        btnLogin.click();

    }
}
