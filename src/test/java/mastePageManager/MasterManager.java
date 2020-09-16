package mastePageManager;

import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.LillyMasterPage;


public class MasterManager {


    private LillyMasterPage lillyMasterPage;
    private static MasterManager  masterManager = new MasterManager();

    public static MasterManager getMasterManager() {
        return masterManager;
    }

    public LillyMasterPage lillyMasterPage(WebDriver driver) {
        if (lillyMasterPage == null) {
            lillyMasterPage = new LillyMasterPage(driver);
            return lillyMasterPage;
        } else {
            return lillyMasterPage;

        }
    }



}