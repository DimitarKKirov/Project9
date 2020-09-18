package pageObjects.pageObjectLillyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pManagers.shopLilly.LillyRegularsElements;

public class LillyShippingDetailsPage extends LillyRegularsElements {

    Actions actions = new Actions(driver);


    public void enterEmailToRegister(String userEmail) {
        WebElement email = driver.findElement(By.xpath("//input[@id=\"customer-email\"]"));
        email.click();
        email.sendKeys(userEmail);
    }

    public void fieldFirstName(String firstName) {
        WebElement name = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        name.click();
        name.sendKeys(firstName);
    }

    public void fieldLastName(String lastName) {
        WebElement lastN = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastN.click();
        lastN.sendKeys(lastName);
    }

    public void fieldPhone(String phoneNumber) {
        WebElement phone = driver.findElement(By.xpath("//input[@name=\"telephone\"]"));
        phone.click();
        phone.sendKeys(phoneNumber);

    }

    public void shippingToOffice() {
        driver.findElement(By.xpath("//input[@name=\"stenik_addrcarrier_method\"]")).click();
    }

    public void shippingToHome() {
        driver.findElement(By.xpath("//input[@value=\"speedy_door\"]")).click();
    }

    public void enterCity(String city) {

        WebElement cityDrop = driver.findElement(By.xpath("//span[@data-select2-id=\"2\"]"));
        cityDrop.click();
        WebElement cityField = driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]"));
        cityField.click();
        cityField.sendKeys(city);

    }

    public WebElement resultOfCitySearch() {
        return driver.findElement(By.xpath("//li[@data-select2-id=\"11\"]"));
    }
    public WebElement resultOfCityOffice() {
        return driver.findElement(By.xpath("//li[@data-select2-id=\"23\"]"));
    }
    public void enterAddressShipmentOffice(String deliveryServiceOffice) {

        WebElement dropDown = driver.findElement(By.xpath("//span[@data-select2-id=\"4\"]"));
        dropDown.click();
        WebElement officeField = driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]"));
        officeField.click();
        officeField.sendKeys(deliveryServiceOffice);

    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void clickContinue() {

        WebElement buttonContinue = driver.findElement(By.xpath("//button[@class=\"button action continue primary\"]"));
        buttonContinue.click();

    }

    public WebElement getStepTitle() {
        return driver.findElement(By.xpath("//div[@class=\"step-title\"]"));
    }
    public WebElement getTypeOfShipping(){
        return driver.findElement(By.xpath("//td[@id=\"label_method_speedy_505_extensaspeedy\"]"));
    }

}
