package StepObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static PageObject.CartPage.*;


public class CartStep {
    public static WebDriver driver;


    public CartStep(WebDriver driver1){
        driver=driver1;

    }

  @Step ("კლიკი კატეგორიაზე - ბავშვი")
    public void clickOnChildButton (){
        driver.findElement(child).click();

    }

  @Step ("კლიკი ფილტრზე")
    public void selector (){
      driver.findElement(selectName).click();
  }

  @Step ("კლიკი ფილტრის მნიშვნელობაზე  Z დან A მდე")

    public void selectIcon (){
        driver.findElement(icon).click();
  }






}
