package RegressionSuite;

import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends SeleniumAPI {
    HomePage homePage;
    String url = "https://www.cigna.com/";

    @BeforeMethod

    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        //driver.get(url);
    }
    @Test
    public void CheckNavigation(){
        homePage.ClickOnNavigationTab();
    }
    @Test
    public void SearchForProduct(){
        homePage.SearchProduct();
    }


}
