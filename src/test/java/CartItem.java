import StepObject.CartStep;
import Utils.SetupLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CartItem  extends SetupLogin {

    @Test (groups = "Test2")
    @Severity(SeverityLevel.TRIVIAL)
    @Description ("სორტირება დასახელებით Z დან A მდე")


    public void itemItem () throws InterruptedException {

       CartStep obj1 = new CartStep(driver);
       obj1.clickOnChildButton();
       obj1.selector();
       obj1.selectIcon();

      Thread.sleep(3000);




    }
}
