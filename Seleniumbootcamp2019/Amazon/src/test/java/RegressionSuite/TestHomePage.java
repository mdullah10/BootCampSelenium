package RegressionSuite;

import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends SeleniumAPI {
    HomePage homePage;
    String url = "https://www.amazon.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    //@Test
    public void ClickOnSignIn() {
        homePage.setSignIn("mdulla1984@gmail.com", "momin0298");

    }

    //@Test
    public void searchItems() {
        homePage.setInputSearch();
    }
    //@Test
    public void ClickOnProduct(){
        homePage.SelectProduct();
    }
    //@Test
    public void AddToCartButton(){
        homePage.AddtoCart();
    }
   // @Test
    public void ClickOnCheckOut(){
        homePage.setCheckOut();
    }
    //@Test
    public void CheckNavigation(){
        homePage.NavigateBack();
    }
    @Test
    public void ClickOnSignOut(){
        homePage.setSignOut();
    }
}