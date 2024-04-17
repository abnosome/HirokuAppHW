package com.hiroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPicPage extends BasePage{
    public UploadPicPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="file-upload")
    WebElement uploadPicture;
    @FindBy(id="file-submit")
    WebElement submitUpload;

    public UploadPicPage upload(String path) {
        uploadPicture.sendKeys(path);
        click(submitUpload);
        return this;
    }
}
