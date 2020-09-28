package pageObjects.pageObjectsEmag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.pManagerEmag.EmagRegularElements;

public class SearchInEmag extends EmagRegularElements {

    public void enterInSearchField (String search){
        WebElement searchField = driver.findElement(By.xpath("//input[@id=\"searchboxTrigger\"]"));
        searchField.click();
        searchField.sendKeys(search);
    }

    public void clickSearch(){
        WebElement searchButton= driver.findElement(By.xpath("//i[@class=\"em em-search\"]"));
        searchButton.click();
    }
}
