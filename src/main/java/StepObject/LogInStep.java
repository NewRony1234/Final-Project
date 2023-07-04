package StepObject;

import PageObject.LogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static PageObject.LogInPage.*;

public class LogInStep  {
   public static WebDriver driver;

   public LogInStep(WebDriver driver1){
        driver = driver1;

  }
@Step ("იმეილის ჩაწერა")
    public void emailInput (String s){
        driver.findElement(email).sendKeys(s);
    }

@Step ("პაროლის ჩაწერა")
    public void  passWordInput (String s){

        driver.findElement(password).sendKeys(s);

    }
@Step("ღილაკზე კლიკი")
    public void clickOnLogIButton (){

        driver.findElement(logInButton).click();
    }



}









