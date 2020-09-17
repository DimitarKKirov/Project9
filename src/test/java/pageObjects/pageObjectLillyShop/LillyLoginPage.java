package pageObjects.pageObjectLillyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.LillyRegularsElements;

public class LillyLoginPage extends LillyRegularsElements {


    public void emailField(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void passField(String pass) {
        driver.findElement(By.id("pass")).sendKeys(pass);

    }

    public void clickLogin() {
        driver.findElement(By.id("send2")).click();
    }

}
