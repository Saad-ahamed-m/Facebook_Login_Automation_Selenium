package com.quinbay.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    public static Selenium obj;

    static {
        try {
            obj = new Selenium("webdriver.chrome.driver","/Users/saadahamed/IdeaProjects/CucumberDemo/src/test/java/com/quinbay/cucumber/chromedriver");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CucumberHooks() throws InterruptedException {
    }

    @Before
    public void CucumberHooks() throws InterruptedException {

        System.out.println("This is a demo of before hook");
    }

    @After
    public void testAfter(){
        System.out.println("This is a demo of after hook");
    }
}
