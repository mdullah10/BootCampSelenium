package regression;

import base.SeleniumAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SeleniumAPI {
    @FindBy(xpath = "username")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passWord;

    @FindBy(xpath = "//*[@id=\"signInBtn\"]")
    WebElement SignOn;

    @FindBy(id = "banking")
     WebElement banking;

    @FindBy(linkText = "Checking")
     WebElement checking;

    @FindBy(linkText = "Savings")
     WebElement Savings;
    @FindBy(xpath = "//div[@role='search']")
     WebElement search;

    @FindBy(xpath = "//input[@placeholder='Tell us what you’re looking for']")
     WebElement inputSearch;




    public void setSignOn(){
        userName.sendKeys("mdulla4562@gmail.com");
        passWord.sendKeys("monim1234");
        SignOn.click();
    }
    public void setbanking(){
        Actions action = new Actions(driver);
        action.moveToElement(banking).build().perform();
        checking.click();
        driver.navigate().back();
        action.moveToElement(banking).build().perform();
        Savings.click();
    }
    public void searchbox(){
        search.click();
        inputSearch.sendKeys("open account", Keys.ENTER);
        sleepFor(2);

    }
}
