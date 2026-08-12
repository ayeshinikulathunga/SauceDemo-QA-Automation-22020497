package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    private By removeButton = By.id("remove-sauce-labs-backpack");
    private By cartItem = By.className("cart_item");
    private By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeProduct() {
        driver.findElement(removeButton).click();
    }

    public boolean isCartEmpty() {
        return driver.findElements(cartItem).isEmpty();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}