package pManagers.shopLilly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Drivers.DriverSwitchBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class LillyRegularsElements implements DriverSwitchBrowser {


    Actions action;
    public static WebDriver driver;
    private static String browserName;
    private static String browserDriverPath;
    private static String browserProperty;

    /*instantiation of singleton page classes, inheritance of methods of:
    1:MainMenu method for selecting from all products menu
    2:Wait method for all inheriting classes
    3:searching and returning current page title
    4:close tab and close browser methods
     */

    private static void setDriver(WebDriver driver) {
        LillyRegularsElements.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private void changeBrowser(String s) {
        String path;
        try {
            if (s.equalsIgnoreCase("Chrome")) {
                path = chrome;
            } else {
                path = fireFox;
            }
            Properties tempProp = new Properties();
            tempProp.load(new FileInputStream(path));
            browserName = tempProp.getProperty("browserName");
            browserDriverPath = tempProp.getProperty("browserDriverPath");
            browserProperty = tempProp.getProperty("browserProps");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public WebDriver startBrowser(String url, String browserName) {

        changeBrowser(browserName);

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty(browserProperty, browserDriverPath);
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("FireFox")) {
            System.setProperty(browserProperty, browserDriverPath);
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        setDriver(driver);
        return driver;

    }

    public WebDriverWait createWait(int timeOut) {
     return new WebDriverWait(driver, timeOut);
    }

    public void allProduct() {
        driver.findElement(By.id("om"));
    }

    public void selectAllProductSubMenuElement(String name) {
        driver.findElement(By.xpath("//span[text()=\"" + name + "\"]")).click();

    }

    public String getPageTitle() {

        return driver.getTitle();
    }
    public WebElement getPageTitleElement(){
        return driver.findElement(By.xpath("//title*"));
    }
    public void quitBrowser() {
        driver.quit();
    }

}
