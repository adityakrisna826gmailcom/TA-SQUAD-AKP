package cucumber.framework.runner.nopc.scenefirst;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/features/nopc/02dashboard.feature",
		"src/main/resources/features/nopc/01login.feature"},
glue = "com.project.tugasakhir.nexsoft.cucumber.framework.runner.nopc",
monochrome=true,
plugin = {"pretty","html:target/nopc/htmlreport/LoginRunner.html",
		"json:target/nopc/jsonreport/LoginRunner.json",
		"junit:target/nopc/junitreport/LoginRunner.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{}