package regression;

import base.SeleniumAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SeleniumAPI {
    @FindBy(id = "email")
    WebElement EmailField;
    @FindBy(id = "pass")
    WebElement passWord;
    @FindBy(xpath = "//*[@id=\"u_0_a\"]")
    WebElement Login;
    @FindBy(xpath = "//*[@id=\"u_f_2\"]/input[2]")
    WebElement inputSearch;
    @FindBy(xpath = "//*[@id=\"js_1j\"]/form/button/i")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@id=\"xt_uniq_3\"]/div/div/div[1]/div[1]/div/a")
    WebElement SearchName;
    @FindBy(xpath = "//*[@id=\"u_fetchstream_2_6\"]/div/div[3]/div/div[4]/div[2]/div/div/div/div/div/form/div/div/div[2]")
    WebElement Comment;
    @FindBy(xpath = "//*[@id=\"u_ps_fetchstream_6_1_3\"]/button[2]")
    WebElement AddFriend;
    public void setSignIn(){
        EmailField.sendKeys("mdullah90@yahoo.com");
        passWord.sendKeys("momin0298");
        Login.click();

    }
    public void setInputSearch(){
        EmailField.sendKeys("mdullah90@yahoo.com");
        passWord.sendKeys("momin0298");
        Login.click();
        sleepFor(3);
        inputSearch.sendKeys("abani sharif");
        SearchButton.click();
    }
    public void SearcByhName(){
        EmailField.sendKeys("mdullah90@yahoo.com");
        passWord.sendKeys("momin0298");
        Login.click();
        sleepFor(3);
        inputSearch.sendKeys("abani sharif");
        SearchButton.click();
        SearchName.click();
    }
    public void SandFriendRequest(){
        EmailField.sendKeys("mdullah90@yahoo.com");
        passWord.sendKeys("momin0298");
        Login.click();
        sleepFor(3);
        inputSearch.sendKeys("suprakash");
        SearchButton.click();
        AddFriend.click();

    }

    public void CommentOnAPost(){
        EmailField.sendKeys("mdullah90@yahoo.com");
        passWord.sendKeys("momin0298");
        Login.click();
        sleepFor(3);
        inputSearch.sendKeys("abani sharif");
        SearchButton.click();
        SearchName.click();
        Comment.sendKeys("WoW");
    }
}
