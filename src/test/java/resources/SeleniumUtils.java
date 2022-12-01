package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    public static void limparCampo(WebElement element){
        Integer size = element.getAttribute("value").length();
        for (int i = 0; i<size; i++) {
            element.sendKeys(Keys.BACK_SPACE);
            element.sendKeys(Keys.DELETE);
        }
    }

    public static void esperarAteCampoVisivel(WebDriver driver,By cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cssSelector));
    }

    public static void selecionarItemDropDown(WebDriver driver, By by, String value){
        new Select(driver.findElement(by)).selectByValue(value);
    }
}
