package com.hiroku.tests;

import com.hiroku.pages.HomePage;
import com.hiroku.pages.OpenNewWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowsTests extends  TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectWindow();
    }

    @Test
    public void NewWindowTest(){
    new OpenNewWindowPage(driver).switchToNextWindow(1).verifyNewWindowMessage("New Window");
    }
}
