package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class Page {
    protected WebDriver driver;

    protected Page(WebDriver driver, String url){
        PageFactory.initElements(driver, this);

        this.driver = driver;

        driver.navigate().to(url);
    }

    public void navigate2Menu(String[] menu) {
        for (String menuPoint : menu){
            driver.findElement(By.xpath(menuPoint)).click();
        }
    }
}
