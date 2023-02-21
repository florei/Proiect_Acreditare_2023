package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;
    public AccountPage (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }


}
