package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initializeDriver() {

        if (driver == null) {

            String browser = ConfigReader.getProperty("browser");

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else {
                throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(
                    Duration.ofSeconds(
                            Integer.parseInt(ConfigReader.getProperty("implicitWait"))
                    )
            );

            driver.manage().timeouts().pageLoadTimeout(
                    Duration.ofSeconds(
                            Integer.parseInt(ConfigReader.getProperty("pageLoadTimeout"))
                    )
            );

            driver.get(ConfigReader.getProperty("url"));
        }

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}

