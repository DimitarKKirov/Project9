package pManagers.shopLilly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LillyRegularsElements {

    WebDriver driver;
    Actions action;


    /*instantiation of singleton page classes, inheritance of methods of:
    1:MainMenu method for selecting from all products menu
    2:Wait method for all inheriting classes
    3:searching and returning current page title
    4:close tab and close browser methods
     */

    public LillyRegularsElements(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public void createWait(int timeOut) {
        new WebDriverWait(driver, timeOut);
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

public void quitBrowser(){
        driver.quit();
        driver=null;
}

}
