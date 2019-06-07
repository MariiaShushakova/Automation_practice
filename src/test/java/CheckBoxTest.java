import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxPage;


public class CheckBoxTest extends BasicTest {
    private static final Logger LOGGER = Logger.getLogger(CheckBoxTest.class);

    @Test
    public void singleCheckboxTest(){
        LOGGER.info("invoke single CheckBoxTest");
        String outputMesage = new CheckBoxPage(driver).singleCheckBoxPage();

        LOGGER.error("Error!");
        Assertions.assertThat("Success - Check box is checked").isEqualTo(outputMesage);
    }
}
