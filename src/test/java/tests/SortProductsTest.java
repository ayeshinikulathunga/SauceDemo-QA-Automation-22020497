package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigReader;

public class SortProductsTest extends BaseTest {

    @Test
    public void testSortLowToHigh() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.sortByVisibleText("Price (low to high)");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}