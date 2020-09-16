package pManagers.shopLilly;

import org.openqa.selenium.WebDriver;

public class LillyHomePage extends LillyRegularsElements {

    WebDriver driver;

    public LillyHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void main(String[] args) {
        Drivers driver = new Drivers();
        LillyHomePage lili= new LillyHomePage(driver.startBrowser("https://shop.lillydrogerie.bg/","chrome"));
        lili.allProduct();
        lili.selectChildrenSubMenuElement();
    }
}

