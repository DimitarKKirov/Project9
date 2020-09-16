package pManagers.shopLilly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {

    private static WebDriver driver;
    private static void setDriver(WebDriver driver) {
        Drivers.driver = driver;
    }
    public static WebDriver startBrowser(String url, String browserName) {
//        changeBrowser(browserName);

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\webDrivers\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\java\\resources\\webDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        setDriver(driver);
        return driver;

    }
}
