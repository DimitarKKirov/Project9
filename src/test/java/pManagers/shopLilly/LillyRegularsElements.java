package pManagers.shopLilly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LillyRegularsElements {

    WebDriver driver;
    Actions action;


    /*instantiation of singleton page classes, inheritance of methods of:
    1:MainMenu all products
    2:
     */

    public LillyRegularsElements(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public WebDriverWait createWait(int timeOut) {
        return new WebDriverWait(driver,timeOut);
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

    public void closeBrowser() {
        driver.quit();
    }

    public void closeTab() {
        driver.close();
    }

}
