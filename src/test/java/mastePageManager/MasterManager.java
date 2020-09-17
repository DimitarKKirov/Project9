package mastePageManager;

import pageObjects.pageObjectLillyShop.LillyPageManager;

public class MasterManager {

    private static MasterManager masterManager= new MasterManager();
    private LillyPageManager lillyPageManager;

    public static MasterManager getMasterManager() {
        return masterManager;
    }

    public LillyPageManager lillyPageManager(){
        if (lillyPageManager==null){
            lillyPageManager = new LillyPageManager();
            return lillyPageManager;
        }return lillyPageManager;
    }
}
