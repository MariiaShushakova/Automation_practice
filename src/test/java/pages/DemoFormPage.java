package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoFormPage extends Page{

    @FindBy(id = "user-message")
    private WebElement userMessageInput;

    @FindBy (xpath = "//*[@id='get-input']/button")
    private WebElement showMessageButton;

    @FindBy (id = "display")
    private WebElement userMessage;

    @FindBy (id = "sum1")
    private WebElement inputA;

    @FindBy (id = "sum2")
    private WebElement inputB;

    @FindBy (id = "displayvalue")
    private WebElement totalResult;

    @FindBy (xpath = "//*[@id='gettotal']/button")
    private WebElement getTotalButton;

    public DemoFormPage(WebDriver driver){
        super(driver,"https://www.seleniumeasy.com/test/basic-first-form-demo.html" );
    }

    public String singleInputForm(String inputMessage){
        userMessageInput.sendKeys("Hello!");

        showMessageButton.click();

        return userMessage.getText();
    }

    public String multiInputForm(String a, String b){
        inputA.sendKeys(a);

        inputB.sendKeys(b);

        getTotalButton.click();

        return totalResult.getText();
    }
}
