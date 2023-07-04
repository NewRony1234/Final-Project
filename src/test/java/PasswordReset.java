import StepObject.PasswordRecoveryStep;
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

import static DataObject.PasswordRecoveryData.*;
import static PageObject.LogInPage.logInButton;


public class PasswordReset extends ChromeRunner {

    @Test(priority = 1, groups = "Test2")
    @Severity(SeverityLevel.NORMAL)
    @Description("პაროლის აღდგენა სწორი მეილით")

    public void resPasswordWithValidMail() throws InterruptedException {

        PasswordRecoveryStep obj1 = new PasswordRecoveryStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(logInButton));

        obj1.clickOnResetButton();
        Thread.sleep(2000);
        obj1.enterMail(validEmail);
        obj1.pressOnSendButton();

        String actualResult = driver.findElement(By.xpath("//*[@id=\"content\"]/div")).getText();

        String expectedResult = "If this email address has been registered in our shop, you will receive a link to reset your password at nikolozbedinashvili@gmail.com.";

        Assert.assertEquals(expectedResult, actualResult);


}
    @Test (priority = 2,groups = "Test2")
    @Severity(SeverityLevel.TRIVIAL)
    @Description ("პაროლის აღდგენა არავალიდური იმეილით")
        public void resPasswordWithInvalidMail () throws InterruptedException {

            PasswordRecoveryStep obj1 = new PasswordRecoveryStep(driver);
            WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                    until(ExpectedConditions.elementToBeClickable(logInButton));

            obj1.clickOnResetButton();
            Thread.sleep(2000);
            obj1.enterMail(invalidEmail);
            obj1.pressOnSendButton();


    }


}
