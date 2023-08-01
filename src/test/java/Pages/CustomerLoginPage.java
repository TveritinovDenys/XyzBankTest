package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage extends BasePage {
    public CustomerLoginPage(WebDriver driver){
        super(driver);
    }

    public Select yourName(){
        return new Select(driver.findElement(By.xpath("//select[@name='userSelect']")));
    }

    public WebElement loginBtn(){
        return driver.findElement(By.xpath("//button[text()='Login']"));
    }


}
