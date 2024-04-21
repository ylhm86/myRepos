package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePageStepDefinitions {

    // Option + Enter Mac
    // Alt + Enter Windows

    @Given("user on the login page")
    public void user_on_the_login_page() {


        Driver.getDriver().get("http://qa1.vytrack.com/user/login");
       // System.out.println("I am logging in");
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty("urlqa1"));

    }

    @When("user logs as a team lead")
    public void user_logs_as_a_team_lead() {


//        loginPage loginPage = new loginPage();
//
//        loginPage.Login(ConfigurationReader.getProperty("storemanagerusername"),
//                ConfigurationReader.getProperty("storemanagerpassword"));
        System.out.println("I am opening the login page");

        Driver.getDriver().get(ConfigurationReader.getProperty("urlqa1"));


        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();

    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("I can see the home page!");

        // verify header
        String expected = "dashboard";

        MapPage mapPage = new MapPage();

     //   BrowserUtils.waitForVisibility(mapPage.dashboard, 5);
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 5);

        wait.until(ExpectedConditions.urlContains("dashboard"));
        // ExpectedConditions.url to be
        String actual = mapPage.dashboard.getText();

        // assertion are coming from Junit
        Assert.assertEquals(expected,actual);


    }
    @And("the title should be correct")
    public void the_title_should_be_correct(){



    }
    @When("user logs as a team member")
    public void user_logs_as_a_team_member() {

        System.out.println("I am login as a member");

        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }
    @Then("the Ylham must be understand")
    public void the_Ylham_must_be_understand() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
    }

}
