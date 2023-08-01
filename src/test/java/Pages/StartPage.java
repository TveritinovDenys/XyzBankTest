package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage{

    public StartPage(WebDriver driver)
    {
        super(driver);
    }

    public WebElement customerLoginBtn(){
        return driver.findElement(By.xpath("//button[text() = 'Customer Login']"));
    }

    public WebElement managerLoginBtn(){
        return driver.findElement(By.xpath("//button[text() = 'Bank Manager Login']"));
    }

    public WebElement homeBtn(){
        return driver.findElement(By.xpath("//button[@class='btn home']"));
    }
}
