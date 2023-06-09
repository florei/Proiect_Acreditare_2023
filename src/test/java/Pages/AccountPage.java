package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;
    public AccountPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css ="strong:nth-child(1)")
    private WebElement welcomeTextElement;

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

}
