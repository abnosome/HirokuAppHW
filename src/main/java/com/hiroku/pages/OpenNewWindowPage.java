package com.hiroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class OpenNewWindowPage extends BasePage{
    public OpenNewWindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/windows/new']")
    WebElement windowButton;
    public OpenNewWindowPage switchToNextWindow(int index) {

        click(windowButton);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo()
                .window(windows.get(index));

            return this;

    }
    @FindBy(css ="h3")
    WebElement sampleHeading;
    public OpenNewWindowPage verifyNewWindowMessage(String text) {
            Assert.assertTrue(shouldHaveText(sampleHeading,text, 10));
        return this;
    }
}
