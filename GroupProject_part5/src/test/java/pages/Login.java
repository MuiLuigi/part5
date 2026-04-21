//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private WebDriver driver;

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By errorMessage = By.xpath("//p[contains(@class,'oxd-alert-content-text')]");
    private By forgotPasswordLink = By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]");
    private By loginTitle = By.xpath("//h5[text()='Login']");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginTitle).isDisplayed();
    }

    public void enterUsername(String username) {
        WebElement user = driver.findElement(usernameField);
        user.clear();
        user.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement pass = driver.findElement(passwordField);
        pass.clear();
        pass.sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText().trim();
    }

    public boolean isForgotPasswordLinkDisplayed() {
        return driver.findElement(forgotPasswordLink).isDisplayed();
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }
}