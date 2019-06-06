import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.DemoFormPage;

public class MenuTest extends BasicTest {

    @Test
    public void navigation2FormPageTest(){
        DemoFormPage demoFormPage = new DemoFormPage(driver);

        demoFormPage.navigate2Menu(new String[] {"//*[@id='treemenu']/li/ul/li[1]/a", "//*[@id='treemenu']/li/ul/li[1]/ul/li[1]"});

        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy Demo - Simple Form to Automate using Selenium");
    }

    @Test
    public void navigate2CheckBoxPageTest(){
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);

        checkBoxPage.navigate2Menu(new String[] {"//*[@id='treemenu']/li/ul/li[1]/a", "//*[@id='treemenu']/li/ul/li[1]/ul/li[2]/a"});

        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy - Checkbox demo for automation using selenium");

    }
}
