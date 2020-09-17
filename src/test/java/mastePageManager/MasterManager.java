package mastePageManager;

import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.LillyMasterPage;
import pageObjects.Drivers.Drivers;


public class MasterManager {

    /*
    Instantiation of the different webSits Master Pages
     */

    private LillyMasterPage lillyMasterPage;
    private Drivers drivers;
    private static MasterManager  masterManager = new MasterManager();

    public static MasterManager getMasterManager() {
        return masterManager;
    }

    public Drivers drivers() {
        if (drivers == null) {
            drivers = new Drivers();
            return drivers;
        } else {
            drivers=null;
            drivers=new Drivers();
            return drivers;

        }
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