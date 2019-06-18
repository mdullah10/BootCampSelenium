package RegressionSuite;

import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends SeleniumAPI {
    HomePage homePage;
    String url = "https://www.cnn.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);

        }
    //@Test
    public void ClickOnNavigationTab () {
        homePage.NavigationTab();
    }
    //@Test
    public void getTextFromPage(){
        homePage.getTextByxpath("This is Donald Trump's secret 2020 weapon");
    }
   // @Test
    public void VerifyNewsPage(){
        homePage.VeryfyNews();
    }
    @Test
    public void searchNewsPage(){
        homePage.SearchNews();
    }
}