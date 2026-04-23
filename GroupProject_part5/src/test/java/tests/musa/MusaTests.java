//Name: Musa Jama
//Course: Application Testing CPAN-224

package tests.musa;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.Admin;
import pages.Dashboard;
import pages.Exit;
import pages.Login;
import pages.PIM;
import utils.Screenshots;

public class MusaTests extends Base {

    @Test(priority = 1)
    public void verifyAdminUserSearch() {
        Login loginPage = new Login(driver);
        Dashboard dashboardPage = new Dashboard(driver);
        Admin adminPage = new Admin(driver);

        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed after login.");

        adminPage.openAdminModule();
        Assert.assertTrue(adminPage.isAdminPageDisplayed(), "Admin page is not displayed.");

        adminPage.searchByUsername("Admin");
    
        Screenshots.capture(driver, "verifyAdminUserSearch");
    }

    @Test(priority = 2)
    public void verifyPIMAddEmployeeAccess() {
        Login loginPage = new Login(driver);
        Dashboard dashboardPage = new Dashboard(driver);
        PIM pimPage = new PIM(driver);

        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed after login.");

        pimPage.openPIMModule();
        Assert.assertTrue(pimPage.isPIMPageDisplayed(), "PIM page is not displayed.");
        Assert.assertTrue(pimPage.isAddEmployeeButtonDisplayed(), "Add Employee button is not displayed.");

    
        Screenshots.capture(driver, "verifyPIMAddEmployeeAccess");
    }

    @Test(priority = 3)
    public void verifyLeaveEntitlementsVisibility() {
        Login loginPage = new Login(driver);
        Dashboard dashboardPage = new Dashboard(driver);
        Exit leavePage = new Exit(driver);

        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed after login.");

        leavePage.openLeaveModule();
        Assert.assertTrue(leavePage.isExitDisplayed(), "Leave page is not displayed.");
        Assert.assertTrue(leavePage.isEntitlementsDisplayed(), "Entitlements tab is not displayed.");

        Screenshots.capture(driver, "verifyLeaveEntitlementsVisibility");
    }

    @Test(priority = 4)
    public void verifyLogoutFunctionality() {
        Login loginPage = new Login(driver);
        Dashboard dashboardPage = new Dashboard(driver);

        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed after login.");

        dashboardPage.logout();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page is not displayed after logout.");

        Screenshots.capture(driver, "verifyLogoutFunctionality");
    }

    @Test(priority = 5)
    public void verifyLoginPageElements() {
        Login loginPage = new Login(driver);

        
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page title is not displayed.");
        Assert.assertTrue(loginPage.isForgotPasswordLinkDisplayed(), "Forgot Password link is not visible.");


        loginPage.enterUsername("test");
        loginPage.enterPassword("test");

        Screenshots.capture(driver, "verifyLoginPageElements");
    }
}