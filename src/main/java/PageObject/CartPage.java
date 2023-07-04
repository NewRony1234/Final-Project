package PageObject;

import org.openqa.selenium.By;

public class CartPage {

    public static
    By
            child = By.xpath("//*[@id=\"cbp-hrmenu-tab-24\"]/a/span"),

            selectName = By.xpath("//span[contains (text(), 'ახალი პროდუქტი დასაწყისში')]"),
            icon = By.xpath("//*[@id=\"js-product-list-top\"]/div/div[3]/div[1]/div/a[3]");

}
