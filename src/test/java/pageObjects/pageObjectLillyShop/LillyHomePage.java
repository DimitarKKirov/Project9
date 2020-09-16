package pageObjects.pageObjectLillyShop;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.Drivers;
import pManagers.shopLilly.LillyRegularsElements;

public class LillyHomePage extends LillyRegularsElements {

    WebDriver driver;

    public LillyHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}

