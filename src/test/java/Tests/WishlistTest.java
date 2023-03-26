package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistTest {

    public void addToWishlistTest

    {

        private WebDriver driver;


        @Before
        public void initDriver () {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        /*System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");*/
        driver = new ChromeDriver();
        /*driver = new FirefoxDriver();*/
        driver.manage().window().maximize();
        driver.get("http://qa5.fasttrackit.org:8008/");
    }

        @Test
        public void loginWithValidData () {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);


        homePage.clickmyAccountbutton();
        loginPage.setUsernameField("florentina.alexa6@gmail.com");
        loginPage.setPasswordField("Programare.QA29");
        loginPage.clickloginButton();
    }

    }
}
