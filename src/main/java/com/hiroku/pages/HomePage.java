package com.hiroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="a[href='/javascript_alerts']")
    WebElement javascriptAlerts;
    public HomePage selectAlerts() {
        click(javascriptAlerts);
        return new HomePage(driver);
    }

    @FindBy(css="a[href*='/windows']")
    WebElement newWindows;
    public HomePage selectWindow() {
        click(newWindows);
        return new HomePage(driver);
    }

    @FindBy(css="a[href*='/checkboxes']")
    WebElement checkbox;
    public HomePage selectCheckbox() {
        click(checkbox);
        return new HomePage(driver);
    }

    @FindBy(css="a[href*='/dropdown']")
    WebElement dropdown;
    public HomePage selectDropdown() {
        click(dropdown);
        return new HomePage(driver);
    }
    @FindBy(css="a[href*='/upload']")
    WebElement file;
    public HomePage picUpload() {
        click(file);
        return new HomePage(driver);
    }
}
