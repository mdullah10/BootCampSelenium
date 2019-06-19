package regression;

import base.SeleniumAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SeleniumAPI {
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[1]/a")
    WebElement NavigationTab;
    @FindBy(xpath = "//*[@id=\"1549921108553\"]/div/div[2]/div/div[1]/div/ul/li[2]/a")
    WebElement BrowserNavigation;
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")
    WebElement SearchBox;
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/div/button")
    WebElement SearchButton;

    public void ClickOnNavigationTab(){
        NavigationTab.click();
    }
    public void SearchProduct() {
        SearchBox.sendKeys("medicalsupplies");
        SearchButton.click();
    }
}
