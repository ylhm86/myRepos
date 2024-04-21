package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {


    @Before (order = 1)
    public void setUp(){

        System.out.println("I am setting up the test from the Hook class!");

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

    }
    @After
    public void tearDown(Scenario scenario){

        System.out.println("I am reporting the results");

        if (scenario.isFailed()){

            final byte [] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/pnq");

        }

        System.out.println("Closing driver");
        Driver.closeDriver();
    }

    @Before("@member")
    public void setUpLead(){
        System.out.println("Set up lead test!");




    }

}
