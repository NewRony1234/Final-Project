import PageObject.LogInPage;
import StepObject.LogInStep;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LogInData.*;
import static PageObject.LogInPage.*;
import static StepObject.LogInStep.*;
import static Utils.ChromeRunner.*;

public class LogIn extends ChromeRunner{



    @Test (priority = 2,groups = "Test3")
    @Description("ავტორიზაცია მცდარი მონაცემებით")
    @Severity(SeverityLevel.NORMAL)
    public void logInWithIncorrectData() throws InterruptedException {


        LogInStep obj1 = new LogInStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(logInButton));

        obj1.emailInput(incorrectEmailData);
        obj1.passWordInput(incorrectPasswordData);
        obj1.clickOnLogIButton();


        String actualResult = driver.findElement(errorText).getText();

        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(3000);


    }
    
    @Test (priority = 2,groups = "Test3")
    @Description("ავტორიზაცია არასწორი პაროლითა და სწორი მეილით")
    @Severity(SeverityLevel.NORMAL)


    public void  logInWithIncorrectPassword () throws InterruptedException {


        LogInStep obj2 = new LogInStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(logInButton));



        obj2.emailInput(validEmail);
        obj2.passWordInput(incorrectPasswordData);
        obj2.clickOnLogIButton();



        String actualResult = driver.findElement(errorText).getText();

        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(3000);


    }


    @Test (priority = 2,groups = "Test3")
    @Description("ავტორიზაცია ცარიელი მონაცემებით")
    @Severity(SeverityLevel.NORMAL)

    public void logIInWithEmptyData () throws InterruptedException {
        LogInStep obj3 = new LogInStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(logInButton));

        obj3.clickOnLogIButton();
        Thread.sleep(3000);

    }


    @Test(priority = 2,groups = "Test3")
    @Description ("ავტორიზაცია არასწორი მეილით და სწორი პაროლით")
    @Severity(SeverityLevel.NORMAL)

    public void LogInWithIncorrectMail (){
        LogInStep obj4 = new LogInStep(driver);
        obj4.emailInput(incorrectEmailData);
        obj4.passWordInput(validPassword);
        obj4.clickOnLogIButton();
        String actualResult = driver.findElement(errorText).getText();

        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test(priority = 3,groups = "Test3")
    @Description("ავტორიზაცია სწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)

    public void LogInWithCorrectDAta () throws InterruptedException {
        LogInStep obj5 = new LogInStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(logInButton));
        obj5.emailInput(validEmail);
        obj5.passWordInput(validPassword);
        obj5.clickOnLogIButton();

        String expectedUrl ="https://dressup.ge/ka/my-account";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(3000);


    }



}








