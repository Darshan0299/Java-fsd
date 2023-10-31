package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\sonal\\Workspace2-git\\ATE-Lesson5-Cucumber\\src\\main\\java\\features\\wikipage.feature",
	glue = {"steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/TestreportToday.html"}, 
	monochrome = true, // console output will be in more readable format
	tags = "@login"
		
		)



public class TestRunner1 {

}
