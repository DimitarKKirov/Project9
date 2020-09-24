package mastePageManager;

import pageObjects.REST.DummyRestApiExample;
import pageObjects.pageObjectLillyShop.LillyPageManager;

public class MasterManager {

    private static MasterManager masterManager= new MasterManager();
    private LillyPageManager lillyPageManager;
    private DummyRestApiExample dummyRestApiExample;

    public static MasterManager getMasterManager() {
        return masterManager;
    }

    public LillyPageManager lillyPageManager(){
        if (lillyPageManager==null){
            lillyPageManager = new LillyPageManager();
            return lillyPageManager;
        }return lillyPageManager;
    }
    public DummyRestApiExample dummyRestApiExample(){
        if (dummyRestApiExample==null){
            dummyRestApiExample = new DummyRestApiExample();
            return dummyRestApiExample;
        }return dummyRestApiExample;
    }
}
