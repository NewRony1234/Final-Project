package PageObject;

import org.openqa.selenium.By;

public class LogInPage {
     public static
    By
            email = By.name("email"),
            password = By.name("password"),
            logInButton = By.id("submit-login"),

            errorText = By.xpath("//*[@id=\"content\"]/section/div/ul/li");


}
