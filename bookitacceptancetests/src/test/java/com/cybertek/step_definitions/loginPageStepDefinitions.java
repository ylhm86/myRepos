package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.ConfigurationReader;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class loginPageStepDefinitions {

    @When("user logs using {string} and {string}")
    public void user_logs_using_and(String storemanagerusername, String storemanagerpassword) {

        //System.out.println(string);
        //System.out.println(string2);

       // System.out.println("email: "+ ConfigurationReader.getProperty("storemanagerusername"));
       // System.out.println("password: "+ ConfigurationReader.getProperty("storemanagerpassword"));

        SignInPage signInPage= new SignInPage();
        signInPage.login(storemanagerusername, storemanagerpassword);


    }

    @Then("the title should be {string}")
    public void the_title_should_be(String exceptedLocation) {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
        System.out.println(exceptedLocation);

        MapPage mapPage = new MapPage();
        String actualLoaction = mapPage.dashboard2.getText();
        Assert.assertEquals(exceptedLocation, actualLoaction);
    }

    @Then("there should be {int} menu options")
    public void there_should_be_menu_options(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
        System.out.println(int1);
    }
    @Then("location should be {string}")
    public void location_should_be (String string){


    }
}
