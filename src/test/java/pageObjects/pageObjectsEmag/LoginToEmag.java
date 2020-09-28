package pageObjects.pageObjectsEmag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.pManagerEmag.EmagRegularElements;

public class LoginToEmag extends EmagRegularElements {

    public void login(){
        Actions action = new Actions(driver);
        WebElement userIcon = driver.findElement(By.xpath("//i[@class=\"em em-user2 navbar-icon\"]"));
            action.moveToElement(userIcon).build().perform();
            userIcon.click();
    }

    public void enterEmail(String email){
      WebElement userEmailField =  driver.findElement(By.xpath("//input[@id=\"user_login_email\"]"));
      userEmailField.click();
      userEmailField.sendKeys(email);
    }
    public void clickContinue(){
        WebElement continueButton = driver.findElement(By.xpath("//button[@id=\"user_login_continue\"]"));
        continueButton.click();
    }

    public void enterPass(String pass){
        WebElement passField = driver.findElement(By.xpath("//input[@name=\"user_login[password]\"]"));
        passField.click();
        passField.sendKeys(pass);
    }
}
