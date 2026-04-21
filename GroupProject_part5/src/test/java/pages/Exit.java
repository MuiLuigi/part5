//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exit {
    private WebDriver driver;

    private By leaveMenu = By.xpath("//span[text()='Leave']");
    private By leaveHeader = By.xpath("//h6[text()='Leave']");
    private By applyTab = By.xpath("//a[normalize-space()='Apply']");
    private By myLeaveTab = By.xpath("//a[normalize-space()='My Leave']");
    private By entitlementsTab = By.xpath("//span[normalize-space()='Entitlements']");

    public Exit(WebDriver driver) {
        this.driver = driver;
    }

    public void openLeaveModule() {
        driver.findElement(leaveMenu).click();
    }

    public boolean isExitDisplayed() {
        return driver.findElement(leaveHeader).isDisplayed();
    }

    public boolean isApplyTabDisplayed() {
        return driver.findElement(applyTab).isDisplayed();
    }

    public boolean isMyExitTabDisplayed() {
        return driver.findElement(myLeaveTab).isDisplayed();
    }

    public boolean isEntitlementsDisplayed() {
        return driver.findElement(entitlementsTab).isDisplayed();
    }
}