package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue= {"stepdefination","hooks"},
        monochrome = true,
        dryRun = false,
//        tags = ("@regression"),
        plugin = { "pretty"}
        )
public class testrunner {

}
