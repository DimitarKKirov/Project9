package pManagers.shopLilly;

import org.openqa.selenium.WebDriver;
import pageObjects.pageObjectLillyShop.LillyHomePage;
import pageObjects.pageObjectLillyShop.LillyLoginPage;

public class LillyMasterPage {

    private WebDriver driver;
    private LillyHomePage lillyHomePage;
    private LillyLoginPage lillyLoginPage;

    public LillyMasterPage (WebDriver driver) {
        this.driver = driver;
    }

    public LillyHomePage lillyHomePage() {
        if (lillyHomePage == null) {
            lillyHomePage = new LillyHomePage(driver);
            return lillyHomePage;
        } else {
            return lillyHomePage;

        }
    }
    public LillyLoginPage lillyLoginPage() {
        if (lillyLoginPage == null) {
            lillyLoginPage = new LillyLoginPage(driver);
            return lillyLoginPage;
        } else {
            return lillyLoginPage;

        }
    }

}
