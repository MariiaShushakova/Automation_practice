import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.CheckBoxPage;


public class CheckBoxTest extends BasicTest {
    @Test
    public void singleCheckboxTest(){
        String outputMesage = new CheckBoxPage(driver).singleCheckBoxPage();

        Assertions.assertThat("Success - Check box is checked").isEqualTo(outputMesage);
    }
}
