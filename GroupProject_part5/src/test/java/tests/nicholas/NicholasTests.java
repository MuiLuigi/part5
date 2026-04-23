//Name: Nicholas Carreiro (N01492047)
//Course: Application Testing (CPAN-224)

package tests.nicholas;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;
import utils.Screenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NicholasTests extends Base {
    @Test(priority = 11)
    public void verifyMyInfoPageAccess() {
        Login loginPage = new Login(driver);
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        driver.findElement(By.xpath("//span[text()='My Info']")).click();
        WebElement heading = driver.findElement(By.xpath("//h6[contains(@class,'oxd-topbar-header-breadcrumb')]"));
        Assert.assertTrue(heading.isDisplayed(), "My Info page is not displayed.");
        Screenshots.capture(driver, "verifyMyInfoPageAccess");
    }
    @Test(priority = 12)
    public void verifyDirectorySearchFunctionality() {
        Login loginPage = new Login(driver);
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        driver.findElement(By.xpath("//span[text()='Directory']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement results = driver.findElement(By.xpath("//div[contains(@class,'orangehrm-container')]"));
        Assert.assertTrue(results.isDisplayed(), "Directory search results are not displayed.");
        Screenshots.capture(driver, "verifyDirectorySearchFunctionality");
    }
    @Test(priority = 13)
    public void verifyTimeModuleVisibility() {
        Login loginPage = new Login(driver);
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        driver.findElement(By.xpath("//span[text()='Time']")).click();
        WebElement timeMenu = driver.findElement(By.xpath("//li[contains(@class,'oxd-main-menu-item-wrapper')]//span[text()='Time']"));
        Assert.assertTrue(timeMenu.isDisplayed(), "Time module is not visible.");
        Screenshots.capture(driver, "verifyTimeModuleVisibility");
    }
    @Test(priority = 14)
    public void verifyRecruitmentModuleAccess() {
        Login loginPage = new Login(driver);
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
        WebElement recruitmentHeading = driver.findElement(By.xpath("//h5[contains(@class,'oxd-table-filter-title')]"));
        Assert.assertTrue(recruitmentHeading.isDisplayed(), "Recruitment module did not load.");
        Screenshots.capture(driver, "verifyRecruitmentModuleAccess");
    }
    @Test(priority = 15)
    public void verifyPerformanceModuleNavigation() {
        Login loginPage = new Login(driver);
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        driver.findElement(By.xpath("//span[text()='Performance']")).click();
        driver.findElement(By.xpath("//a[text()='My Trackers']")).click();
        WebElement trackersHeading = driver.findElement(By.xpath("//h6[contains(@class,'oxd-topbar-header-breadcrumb')]"));
        Assert.assertTrue(trackersHeading.isDisplayed(), "Performance My Trackers page did not load.");
        Screenshots.capture(driver, "verifyPerformanceModuleNavigation");
    }
}