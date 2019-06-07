import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

abstract public class BasicTest {
    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(BasicTest.class);
    protected WebDriver driver;

    @BeforeMethod
    protected void setup() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/Mariia_Shushakova/IdeaProjects/Automation_practice/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void closeBrowser(ITestResult testResult) {
        makeScreenShot(testResult);
        driver.quit();
    }

    private void makeScreenShot(ITestResult testResult) {
        if (!testResult.isSuccess()) {
            File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.moveFile(scr, new File("d:\\scr\\" + testResult.getName() + ".png"));
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }
}
