package StepObject;

import PageObject.PasswordRecoveryPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static PageObject.PasswordRecoveryPage.*;
import static DataObject.PasswordRecoveryData.*;

public class PasswordRecoveryStep {

    public static WebDriver driver;

    public PasswordRecoveryStep(WebDriver driver2) {
        driver = driver2;


    }

    @Step("დაგავიწყდა პაროლი?")
    public void clickOnResetButton() {
        driver.findElement(passResButton).click();


    }

    @Step("იმეილის ჩაწერა")

    public void enterMail(String s) {
        driver.findElement(emailField).sendKeys(s);

    }

    @Step("ბმულის გაგზავნა")

    public void pressOnSendButton(){

        driver.findElement(sendButton).click();
    }

}