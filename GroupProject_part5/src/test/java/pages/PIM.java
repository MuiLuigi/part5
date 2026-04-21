//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM {
    private WebDriver driver;

    private By pimMenu = By.xpath("//span[text()='PIM']");
    private By pimHeader = By.xpath("//h6[text()='PIM']");
    private By addEmployeeButton = By.xpath("//button[normalize-space()='Add']");
    private By employeeListLabel = By.xpath("//h5[text()='Employee Information']");

    public PIM(WebDriver driver) {
        this.driver = driver;
    }

    public PIM(WebDriver driver, boolean dummy) {
        this.driver = driver;
    }

    public void openPIMModule() {
        driver.findElement(pimMenu).click();
    }

    public boolean isPIMPageDisplayed() {
        return driver.findElement(pimHeader).isDisplayed();
    }

    public boolean isAddEmployeeButtonDisplayed() {
        return driver.findElement(addEmployeeButton).isDisplayed();
    }

    public boolean isEmployeeListDisplayed() {
        return driver.findElement(employeeListLabel).isDisplayed();
    }
}