import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.DemoFormPage;

public class DemoFormTest extends BasicTest {

    @Test
    public void singleInputTest(){
        //DemoFormPage demoFormPage = new DemoFormPage(driver); - instance page
        String outputMessage = new DemoFormPage(driver).singleInputForm("Hello");

        Assertions.assertThat("Hello!").isEqualTo(outputMessage);
    }

    @Test
    public void multiInputTest(){
        String totalResult = new DemoFormPage(driver).multiInputForm("1", "3");

        Assertions.assertThat("4").isEqualTo(totalResult);
    }

    @Test
    public void multiInputNaNTest(){
        String totalResult = new DemoFormPage(driver).multiInputForm("1", "abc");

        Assertions.assertThat("NaN").isEqualTo(totalResult);
    }
}
