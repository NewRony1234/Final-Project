package Utils;

import DataObject.LogInData;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetupLogin implements LogInData {
    public WebDriver driver;
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot(){

        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
    @BeforeMethod  (description = "ავტორიზაცია",groups = "Test3")

    public void login (){

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://dressup.ge/ka/%E1%83%90%E1%83%95%E1%83%A2%E1%83%9D%E1%83%A0%E1%83%98%E1%83%96%E1%83%90%E1%83%AA%E1%83%98%E1%83%90?back=my-account");
        driver.findElement(By.name("email")).sendKeys(validEmail);
        driver.findElement(By.name("password")).sendKeys(validPassword);
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);



    }
    @AfterMethod (description ="ბრაუზერის დახურვა ", groups = "Test3")
    public void chromeClose(){
        takeScreenshot();
        driver.close();
    }
}
