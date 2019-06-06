import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BasicTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void setup() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/Mariia_Shushakova/IdeaProjects/Automation_practice/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void closeBrowser() {
        driver.quit();
    }

}
