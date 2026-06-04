package com.sauce.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Using 'classpath' tells Cucumber to look inside the 'resources' folder automatically
        features = "src/test/resources/features",
        glue = {"com.sauce.stepdefs", "com.sauce.hooks"},
        plugin = {
                "pretty",
                "html:target/reports/report.html"
        },
        monochrome = true
)
public class TestRunner {
}

