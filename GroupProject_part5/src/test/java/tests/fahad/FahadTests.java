//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package tests.fahad;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.Login;
import utils.Screenshots;

public class FahadTests extends Base {

    @Test(priority = 1)
    public void verifyLoginPageLoadsSuccessfully() {
        Login loginPage = new Login(driver);
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page is not displayed.");
        Screenshots.capture(driver, "verifyLoginPageLoadsSuccessfully");
    }

    @Test(priority = 2)
    public void verifyValidLogin() {
        Login loginPage = new Login(driver);
        Dashboard dashboardPage = new Dashboard(driver);

        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed after login.");
        Screenshots.capture(driver, "verifyValidLogin");
    }

    @Test(priority = 3)
    public void verifyInvalidLoginWithWrongPassword() {
        Login loginPage = new Login(driver);

        loginPage.login("Admin", "wrongPassword123");

        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid credentials");
        Screenshots.capture(driver, "verifyInvalidLoginWithWrongPassword");
    }

    @Test(priority = 4)
    public void verifyInvalidLoginWithWrongUsername() {
        Login loginPage = new Login(driver);

        loginPage.login("WrongAdmin", "admin123");

        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid credentials");
        Screenshots.capture(driver, "verifyInvalidLoginWithWrongUsername");
    }

    @Test(priority = 5)
    public void verifyForgotPasswordLinkIsVisible() {
        Login loginPage = new Login(driver);

        Assert.assertTrue(loginPage.isForgotPasswordLinkDisplayed(), "Forgot Password link is not visible.");
        Screenshots.capture(driver, "verifyForgotPasswordLinkIsVisible");
    }
}