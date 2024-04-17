package com.hiroku.tests;

import com.hiroku.pages.CheckboxesPage;
import com.hiroku.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectCheckbox();
    }

    @Test
    public void checkbox(){
    new CheckboxesPage(driver).selectCheckbox(new String[]{" checkbox 1 "});
    }

}
