//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Admin {
    private WebDriver driver;

    private By adminMenu = By.xpath("//span[text()='Admin']");
    private By adminHeader = By.xpath("//h6[text()='Admin']");
    private By usernameSearchField = By.xpath("(//input[contains(@class,'oxd-input')])[2]");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By resetButton = By.xpath("//button[@type='reset']");

    public Admin(WebDriver driver) {
        this.driver = driver;
    }

    public void openAdminModule() {
        driver.findElement(adminMenu).click();
    }

    public boolean isAdminPageDisplayed() {
        return driver.findElement(adminHeader).isDisplayed();
    }

    public void searchByUsername(String username) {
        driver.findElement(usernameSearchField).sendKeys(username);
        driver.findElement(searchButton).click();
    }

    public boolean isResetButtonDisplayed() {
        return driver.findElement(resetButton).isDisplayed();
    }
}