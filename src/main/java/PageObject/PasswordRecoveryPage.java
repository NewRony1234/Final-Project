package PageObject;

import org.openqa.selenium.By;

public  class PasswordRecoveryPage {
  public static
    By

        passResButton = By.xpath("//*[@id=\"login-form\"]/section/div[3]/a"),
        emailField = By.id("email"),
        sendButton = By.name("submit");



}
