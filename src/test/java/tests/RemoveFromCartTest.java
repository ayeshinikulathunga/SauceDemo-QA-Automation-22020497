package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigReader;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void testRemoveProductFromCart() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.addBackpackToCart();
        productsPage.openCart();

        CartPage cartPage = new CartPage(driver);

        cartPage.removeProduct();

        Assert.assertTrue(cartPage.isCartEmpty());
    }
}