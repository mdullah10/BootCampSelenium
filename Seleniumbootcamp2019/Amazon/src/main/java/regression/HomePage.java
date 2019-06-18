package regression;

import base.SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SeleniumAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement SignIn;
    @FindBy(name = "email")
    WebElement UserId;
    @FindBy(name = "password")
    WebElement PassWord;
    @FindBy(id = "signInSubmit")
    WebElement SignInButton;
    @FindBy(id = "twotabsearchtextbox")
    WebElement inputSearch;
    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement SeaechButton;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement SelectItem;
    @FindBy(id = "add-to-cart-button")
    WebElement AddToCart;
    @FindBy(id = "hlb-ptc-btn-native")
    WebElement CheckOut;
    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    WebElement SignOut;

    public void setSignIn(String User, String Pass) {
        SignIn.click();
        UserId.sendKeys(User);
        sleepFor(3);
        PassWord.sendKeys(Pass);
        SignInButton.click();
        sleepFor(3);
    }

    public void setInputSearch() {
        inputSearch.sendKeys("iPhone");
        SeaechButton.click();
    }

    public void SelectProduct() {
        inputSearch.sendKeys("iPhone");
        SeaechButton.click();
        SelectItem.click();
        sleepFor(5);
    }

    public void AddtoCart() {
        inputSearch.sendKeys("iPhone");
        SeaechButton.click();
        SelectItem.click();
        sleepFor(2);
        AddToCart.click();
        sleepFor(5);
    }

    public void setCheckOut() {
        inputSearch.sendKeys("iPhone");
        SeaechButton.click();
        SelectItem.click();
        AddToCart.click();
        sleepFor(2);
        CheckOut.click();
        sleepFor(4);
    }

    public void NavigateBack() {
        inputSearch.sendKeys("iPhone");
        SeaechButton.click();
        SelectItem.click();
        driver.navigate().back();
        sleepFor(3);
    }

    public void setSignOut() {
        SignIn.click();
        UserId.sendKeys("mdulla1984@gmail.com");
        sleepFor(3);
        PassWord.sendKeys("momin0298");
        SignInButton.click();

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"))).build().perform();
        SignOut.click();
        sleepFor(5);
    }

}
