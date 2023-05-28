package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestWithPom {
    WebDriver driver;

    @Test
    public  void testWithPom() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();

        BrowserStackHomePage homepage = new BrowserStackHomePage(driver);
        Thread.sleep(4000);
        homepage.clickOnGetStartedFree();

        driver.quit();

    }
}
