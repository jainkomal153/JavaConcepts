public class PageObjectModel {


    FindBy(id ="APjFqb");
    WebElement searchBox;
    FindBy(id="searchButton");
    WebElement searchBtn;

    public void searchForText(String text){
        searchBox.click();
        searchBox.sendKeys(text);
        searchBtn.click();
    }

    class StepDefinition {
        @When "User searches for text"
        public void UserSearchesForText(){
            PageObjectModel pageObjectModel = new PageObjectModel();
            pageObjectModel.searchForText("text");
        }
    }

}
