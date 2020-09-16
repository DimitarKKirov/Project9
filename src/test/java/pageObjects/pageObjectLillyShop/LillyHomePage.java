package pageObjects.pageObjectLillyShop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.LillyRegularsElements;

public class LillyHomePage extends LillyRegularsElements {

    WebDriver driver;

    public LillyHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//li[@class=\"authorization-link\"]/a")).click();

    }

}


