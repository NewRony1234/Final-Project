import StepObject.LogOutStep;
import Utils.SetupLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends SetupLogin {


        @Test (groups = "Test2")
        @Severity(SeverityLevel.TRIVIAL)
        @Description ("კაბინეტიდან გასვლა")

        public void logOutFrom() throws InterruptedException {
            LogOutStep obj1 = new LogOutStep(driver);
            obj1.out();
            Thread.sleep(3000);
            String expectedUrl ="https://dressup.ge/ka/%E1%83%90%E1%83%95%E1%83%A2%E1%83%9D%E1%83%A0%E1%83%98%E1%83%96%E1%83%90%E1%83%AA%E1%83%98%E1%83%90?back=my-account";
            String actualUrl= driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl,actualUrl);

        }

}

