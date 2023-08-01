package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }

    @AfterMethod
    public void finish()
    {
        driver.get().quit();
    }

    public WebDriver getDriver()
    {
        return driver.get();
    }

    public void runSite()
    {
        getDriver().get("");
    }

}
