package com.hiroku.tests;

import com.hiroku.pages.AlertsPage;
import com.hiroku.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectAlerts();
    }

    @Test
    public void Alert(){
        new AlertsPage(driver)
                .alertFirst()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }

    @Test
    public void ConfirmAlert(){
        new AlertsPage(driver)
                .selectResult("OK")
                .verifyResult("You clicked: Ok");
    }

    @Test
    public void  typeMessageToAlertTest(){
        new AlertsPage(driver)
                .typeMessageToAlert("Love")
                .verifyResult("Love");
    }
}
