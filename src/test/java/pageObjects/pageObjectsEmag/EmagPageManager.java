package pageObjects.pageObjectsEmag;

public class EmagPageManager {

    private LoginToEmag loginToEmag;
    private SearchInEmag searchInEmag;


    public LoginToEmag loginToEmag(){
        if (loginToEmag==null){
            loginToEmag = new LoginToEmag();
            return loginToEmag;

        }return loginToEmag;
    }
    public SearchInEmag searchInEmag(){
        if (searchInEmag==null){
            searchInEmag = new SearchInEmag();
            return searchInEmag;

        }return searchInEmag;
    }


}
