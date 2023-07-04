package StepObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


import static PageObject.LogOutPage.*;
public class LogOutStep {

        public static WebDriver driver;

        public LogOutStep(WebDriver driver1) {
            driver = driver1;
        }
    @Step(" \" გასვლა \"ღილაკზე კლიკი")

    public void out () {

        driver.findElement(logOutButton).click();
    }
}
