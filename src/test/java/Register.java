import StepObject.RegisterStep;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static PageObject.RegisterPage.button;

public class Register extends ChromeRunner {


    @Test (priority = 1,groups = "Test2")
    @Severity(SeverityLevel.NORMAL)
    @Description("რეგისტრაცია არსებული მომხმარებლის იმეილის გამოყენებით")

    public void registerWithAlreadyRegisteredEmail () throws InterruptedException {
        RegisterStep obj1 = new RegisterStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(button));
        obj1.clickOn();
        obj1.fillEmail();
        obj1.fillName();
        obj1.fillLastName();
        obj1.fillID();
        obj1.fillPassword();
        String expectedResult = "The email is already used, please choose another one or sign in";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/div/ul/li")).getText();

        Assert.assertEquals(expectedResult,actualResult);
    }

   @Test (priority = 2,groups = "Test2")
   @Severity(SeverityLevel.TRIVIAL)
   @Description("რეგისტრაცია ცარიელი ველებით")

    public void RegisterWithEmptyData (){
       RegisterStep obj1 = new RegisterStep(driver);
       WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(button));
       obj1.emptyFields();



   }
}
