package mastePageManager;

import pageObjects.REST.DummyRestApiExample;
import pageObjects.SOAP.SoapTestingDneonLine;
import pageObjects.pageObjectLillyShop.LillyPageManager;

public class MasterManager {

    private static MasterManager masterManager= new MasterManager();
    private LillyPageManager lillyPageManager;
    private DummyRestApiExample dummyRestApiExample;
    private SoapTestingDneonLine soapTestingDneonLine;

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

    public SoapTestingDneonLine soapTestingDneonLine(){
        if (soapTestingDneonLine==null){
            soapTestingDneonLine = new SoapTestingDneonLine();
            return soapTestingDneonLine;
        }return soapTestingDneonLine;
    }
}
