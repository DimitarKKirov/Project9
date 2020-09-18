package pageObjects.Drivers;

public class BrowserManager {

    private Drivers drivers;

    public Drivers drivers() {
        if (drivers == null) {
            drivers = new Drivers();
            return drivers;
        } else {
            return drivers;

        }
    }
}