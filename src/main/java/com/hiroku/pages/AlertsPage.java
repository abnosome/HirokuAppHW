package com.hiroku.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlert;
    
    public AlertsPage alertFirst() {
        click(jsAlert);
        return this;
    }

    public AlertsPage acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }
    @FindBy(id = "result")
    WebElement result;
    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement confirmAlert;


    public AlertsPage selectResult(String text) {
        click(confirmAlert);
        if(text != null && text.equals("OK")){
            driver.switchTo().alert().accept();
        } else if (text != null && text.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;

    }
    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement PromptAlert;
    public AlertsPage typeMessageToAlert(String text) {
        click(PromptAlert);
        if(text != null){
            driver.switchTo().alert().sendKeys(text);
            driver.switchTo().alert().accept();
        }
        return this;
    }


}
