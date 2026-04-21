//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    private WebDriver driver;

    private By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    private By userDropdown = By.xpath("//p[contains(@class,'oxd-userdropdown-name')]");
    private By logoutLink = By.xpath("//a[text()='Logout']");
    private By sideMenuItems = By.xpath("//ul[@class='oxd-main-menu']");

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardHeader).isDisplayed();
    }

    public boolean isSideMenuDisplayed() {
        return driver.findElement(sideMenuItems).isDisplayed();
    }

    public void logout() {
        driver.findElement(userDropdown).click();
        driver.findElement(logoutLink).click();
    }
}