package com.cybertek.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "htm:target/default-cucumber-reports",
                "jason:target/cucumber.jason"
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions"
        , dryRun = false
        , tags = "@wip"




)
public class CukesRunner {
}
