package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;

    @Test
    public void testWithPageFactory() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        HomePage hp= new HomePage(driver);

        Thread.sleep(3000);
        hp.clickOnGetStartedBtn();

        SignUpPage signP= new SignUpPage(driver);
        Thread.sleep(3000);
        signP.enterFullName();
        signP.enterBusinessEmail();
        signP.enterPasswrod();
        signP.clickOnAgreeBtn();
        signP.clickOnSignUpBtn();

        driver.close();
    }

}
