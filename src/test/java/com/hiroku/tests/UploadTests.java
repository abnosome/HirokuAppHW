package com.hiroku.tests;

import com.hiroku.pages.HomePage;
import com.hiroku.pages.UploadPicPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).picUpload();
    }

    @Test
    public void uploadPicture(){
        new UploadPicPage(driver).upload("C:/Tools/blueberry.jpg");

    }
}
