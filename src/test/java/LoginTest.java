import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void loginWithValidData(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://qa5.fasttrackit.org:8008/");

        WebElement accountLink = driver.findElement(By.cssSelector(".store-menu li a[href$='7']"));
        accountLink.click();
        driver.findElement(By.id("username")).sendKeys("florentina.alexa6@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Programare.QA29");

        wait(6);

        driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();


        driver.close();

    }

    public static void wait (int seconds){
        try {
            Thread.sleep(seconds*1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
