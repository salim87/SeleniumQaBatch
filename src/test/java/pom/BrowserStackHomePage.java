package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackHomePage {
    WebDriver driver;

    public BrowserStackHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By clickGetStartedFreeBtn=  By.cssSelector("#signupModalButton");

    public void clickOnGetStartedFree(){
        driver.findElement(clickGetStartedFreeBtn).click();
    }
}
