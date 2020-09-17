package pageObjects.Drivers;

import java.io.File;

public interface DriverSwitchBrowser {
    File chr= new File("src\\test\\java\\resources\\properties\\Chrome.properties");
    File fF=new File("src\\test\\java\\resources\\properties\\FireFox.properties");
    String chrome = chr.getAbsolutePath();
    String fireFox = fF.getAbsolutePath();
}
