package RegressionSuite;

import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends SeleniumAPI {
    HomePage homePage;
    String url = "https://www.citibank.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        //driver.get(url);
    }
   // @Test
    public void ClickOnSignOn(){
        homePage.setSignOn();
    }
    @Test
    public void ClickOnBanking(){
        homePage.setbanking();
    }
    @Test
    public void searchboxTest(){
        homePage.searchbox();
    }
}