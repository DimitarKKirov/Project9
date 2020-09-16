package pManagers.shopLilly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LillyRegularsElements {
    WebDriver driver;


    /*instantiation of singleton page classes, inheritance of methods of:
    1:MainMenu all products
    2:
     */

    public LillyRegularsElements(WebDriver driver) {
        this.driver = driver;
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
