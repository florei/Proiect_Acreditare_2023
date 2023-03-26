package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id= "username")
    private WebElement usernameField;

    @FindBy (id= "password")
    private WebElement passwordField;

    @FindBy (css = "[name=login]")
    private WebElement loginButton;

    public void setUsernameField(String value){
        usernameField.sendKeys(value);
    }

    public void setPasswordField(String value){
        passwordField.sendKeys(value);
    }
    public void clickloginButton(){
        loginButton.click();
    }




}
