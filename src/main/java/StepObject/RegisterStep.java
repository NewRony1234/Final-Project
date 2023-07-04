package StepObject;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.RegisterData.*;
import static PageObject.RegisterPage.*;

public class RegisterStep {
    public WebDriver driver;


    public RegisterStep (WebDriver driver1){

        driver=driver1;

    }
    @Step ( "კლიკი ღილაკზე რეგისტრაცია")
    public void clickOn () throws InterruptedException {
        driver.findElement(button).click();
    }
    @Step ("იმეილის შევსება")
    public void fillEmail() {
        driver.findElement(emailField).sendKeys(email);
    }

    @Step ("სახელის შევსება")
    public void fillName (){driver.findElement(firstNameField).sendKeys(fistName);
    }

    @Step ("გვარის შევსება")

    public void fillLastName () {    driver.findElement(lastNameField).sendKeys(lastName);
    }
    @Step ("პირადი ნომრის შევსება")
    public void fillID (){    driver.findElement(idField).sendKeys(idNumber);
    }
    @Step ("პაროლის შევსება ")
    public void fillPassword () throws InterruptedException {
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(passwordField).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }




 @Step ("ველების ცარელი დატოვება +enter")
    public void emptyFields(){
        driver.findElement(button).click();
        driver.findElement(lastNameField).click();

    }
}
