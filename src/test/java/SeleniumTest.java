import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {

    ChromeDriver chromeDriver;
    @BeforeEach

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

//    @Test
//    public void testDK(){
//        chromeDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/Registration.html");
//
//        WebElement inputFirstName = chromeDriver.findElement(By.xpath("//input[@id='firstname']"));
//        inputFirstName.sendKeys("Anh");
//
//        WebElement inputLastName = chromeDriver.findElement(By.xpath("//input[@id='lastname']"));
//        inputLastName.sendKeys("Than");
//
//        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='emailId']"));
//        inputEmail.sendKeys("tanh23.vp@gmail.com");
//
//        WebElement inputPhone = chromeDriver.findElement(By.xpath("//input[@id='contactNumber']"));
//        inputPhone.sendKeys("0375524677");
//
//        WebElement inputUser = chromeDriver.findElement(By.xpath("//input[@id='usr']"));
//        inputUser.sendKeys("anhttph55229");
//
//        WebElement inputPass = chromeDriver.findElement(By.xpath("//input[@id='pwd']"));
//        inputPass.sendKeys("AnhAnh2306@");
//
//        WebElement btnDK = chromeDriver.findElement(By.xpath("//input[@value='Submit']"));
//        btnDK.click();
//
//    }

    @Test
    public void testDN(){
        chromeDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//input[@id='usr']"))));
        email.sendKeys("tanh23.vp@gmail.com");

        WebElement mk =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pwd']")));
        mk.sendKeys("AnhAnh2306@");

        WebElement btnDN =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
        btnDN.click();

    }
}
