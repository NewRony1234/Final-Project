package Utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public WebDriver driver;
    @BeforeMethod (description = "Chrome ბრაუზერის გახსნა",groups = "Test2")

    public void openChrome (){
        driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://dressup.ge/ka/%E1%83%90%E1%83%95%E1%83%A2%E1%83%9D%E1%83%A0%E1%83%98%E1%83%96%E1%83%90%E1%83%AA%E1%83%98%E1%83%90?back=my-account");


    }


    @AfterMethod (description = "Chrome ბრაუზერის დახურვა",groups = "Test2")

    public void closeChrome()  {
        takeScreenshot();

        driver.close();
    }
}
