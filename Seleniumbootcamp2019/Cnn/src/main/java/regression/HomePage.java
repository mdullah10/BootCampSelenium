package regression;

import base.SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SeleniumAPI {

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[3]")
    WebElement navigation;

    @FindBy(xpath = "//*[@id=\"politics-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[2]/h3/a/span[1]")
    WebElement readNews;

    @FindBy(xpath = "//*[@id=\"search-button\"]")
    WebElement SearchButton;

    @FindBy(xpath = "//*[@id=\"search-input-field\"]")
    WebElement SearchNews;

    public void NavigationTab(){
        navigation.click();
    }
    public String getTextByxpath(String locator) {
        String st =driver.findElement(By.xpath("//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[2]/ul/li[2]/article/div/div[2]/h3/a/span[1]/strong")).getText();
        return st;
    }
    public void VeryfyNews(){
        navigation.click();
        if (readNews.isDisplayed()){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
    }
    public void SearchNews(){
        SearchButton.click();
        SearchNews.sendKeys("Health");
        SearchButton.click();
    }

}
