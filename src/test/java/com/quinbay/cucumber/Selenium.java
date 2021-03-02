package com.quinbay.cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Selenium
{
    private WebDriver driver;
    private String email="//input[@id='email']";
    private String password="//input[@id='pass']";
    private String submit="//button[@value='1']";
    private String error="//div[@class='fsl fwb fcb']";
    private String errors="//div[@id='error_box']";
    public Selenium(String driverloc, String driverval) throws InterruptedException {
        System.setProperty(driverloc,driverval);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
    }
    public void entername(String evalue)
    {
        ((ChromeDriver) driver).findElementByXPath(email).click();
        ((ChromeDriver) driver).findElementByXPath(email).sendKeys(evalue);
    }
    public void enterpass(String passvalue)
    {
        ((ChromeDriver) driver).findElementByXPath(password).click();
        ((ChromeDriver) driver).findElementByXPath(password).sendKeys(passvalue);
        ((ChromeDriver) driver).findElementByXPath(submit).submit();
    }
    public boolean check()
    {
        if(((ChromeDriver) driver).findElementByXPath(errors).isDisplayed()) {
            driver.quit();
            return true;
        }
        else
            return false;
    }
}