package RegressionSuite;

import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends SeleniumAPI {
    HomePage homePage;
    String url = "https://www.facebook.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }
   // @Test
    public void ClickOnLogin(){
        homePage.setSignIn();
    }
   // @Test
    public void ClickOnSearchButton(){
        homePage.setInputSearch();
    }
   // @Test
    public void ClickOnName(){
        homePage.SearcByhName();
    }
    //@Test
    public void CommentAPost(){
        homePage.CommentOnAPost();
    }
    @Test public void FriendRequestSand(){
        homePage.SandFriendRequest();
    }
}
