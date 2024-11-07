package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
                 glue="steps",
                 tags="@reg0170",
                 stepNotifications=false,
                 dryRun=true
                 )

public class RegRunner {

}
