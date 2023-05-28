package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css= "#user_full_name")
    WebElement name;

    @FindBy (xpath="//input[@id='user_email_login']")
    WebElement email;

    @FindBy(id="user_password")
    WebElement password;

    @FindBy (id="tnc_checkbox")
    WebElement agreeBtn;

    @FindBy (xpath="//input[@id='user_submit']")
    WebElement signUpBtn;

    public void enterFullName() throws InterruptedException {
        Thread.sleep(3000);
        name.sendKeys("Hasan");
    }
    public void enterBusinessEmail() {
        email.sendKeys("edghtechnow@gmail.com");
    }
    public void enterPasswrod() {
        password.sendKeys("QaBatch2023");
    }

    public void clickOnAgreeBtn() {
        agreeBtn.click();
    }

    public void clickOnSignUpBtn() {
        signUpBtn.click();
    }
}
