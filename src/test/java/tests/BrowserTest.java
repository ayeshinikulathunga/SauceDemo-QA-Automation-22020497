package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {

    @Test
    public void verifyOpenCartLoads() {
        System.out.println("Page title: " + driver.getTitle());
    }
}