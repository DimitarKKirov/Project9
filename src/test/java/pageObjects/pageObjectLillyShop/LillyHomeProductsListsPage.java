package pageObjects.pageObjectLillyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pManagers.shopLilly.LillyRegularsElements;

public class LillyHomeProductsListsPage extends LillyRegularsElements {


    public void clickFirstItemOfList() {
        WebElement buy = driver.findElement(By.cssSelector("button.action.tocart.primary"));
        Actions action = new Actions(driver);
        action.moveToElement(buy).moveByOffset(3, 5).build().perform();
        buy.click();
    }

    public void clickSecondItemOfList() {
        WebElement buy2 = driver.findElement(By.xpath("//li[@class=\"item product product-item\"]//div[@class=\"actions-primary\"]" +
                "//form[contains(@action,\"https://shop.lillydrogerie.bg/checkout/cart/add/uenc/" +
                "aHR0cHM6Ly9zaG9wLmxpbGx5ZHJvZ2VyaWUuYmcvcHJvZHVrdGktemEtZG9tYQ%2C%2C/product/77926/\")]"));
        Actions action = new Actions(driver);
        action.moveToElement(buy2).build().perform();
        buy2.click();
    }

    public WebElement getPriceOfCart() {
        Actions actions = new Actions(driver);
        WebElement price = driver.findElement(By.xpath("//span[@class=\"showcart-price\"]//span[@class=\"price\"]"));
        actions.moveToElement(price).build().perform();
        return  price;
    }

    public void openCart() {
        WebElement cart = driver.findElement(By.xpath("//span[text()=\"Количка\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(cart).build().perform();
        cart.click();
    }
    public void clickCheckOut() {
        Actions actions = new Actions(driver);
        WebElement checkOut = driver.findElement(By.xpath("//button[@title=\"Към завършване\"]/span"));
        actions.moveToElement(checkOut).build().perform();
        checkOut.click();
    }
}
