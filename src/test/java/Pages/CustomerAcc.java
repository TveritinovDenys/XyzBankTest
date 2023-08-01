package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerAcc extends BasePage {
    public CustomerAcc(WebDriver driver){
        super(driver);
    }

    public WebElement transactionsBtn(){
        return driver.findElement(By.xpath("//button[contains(text(),'Transactions')]"));
    }

    public WebElement depositBtn(){
        return driver.findElement(By.xpath("//button[contains(text(),'Deposit')]"));
    }

    public WebElement withdrawBtn(){
        return driver.findElement(By.xpath("//button[contains(text(),'Withdrawl')]"));
    }

    public Select numberAccSelect(){
        return new Select(driver.findElement(By.xpath("name='accountSelect'")));
    }

    public WebElement logoutBtn(){
        return driver.findElement(By.xpath("//button[text() = 'Logout']"));
    }

    public WebElement homeBtn(){
        return driver.findElement(By.xpath("//button[@class='btn home']"));
    }

    public WebElement submitDepositBtn(){
        return driver.findElement(By.xpath("//button[@type='submit']  [text() = 'Deposit']"));
    }

    public WebElement submitWithdrawBtn(){
        return driver.findElement(By.xpath("//button[@type='submit']  [text() = 'Withdraw']"));
    }


}
