package cucumber.framework.runner.siloam.viewexportpageoutline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/Features/SiloamOutline/070AdminMelihatDataKaryawanInvalid.feature"},
glue = "cucumber.framework.runner.siloam.viewexportpageoutline",
monochrome=true,
plugin = {"pretty","html:target/siloamoutline/htmlreport/ViewExportPageInvalid.html",
		"json:target/siloamoutline/jsonreport/ViewExportPageInvalid.json",
		"junit:target/siloamoutline/junitreport/ViewExportPageInvalid.xml"})

public class ViewExportRunnerOutline extends AbstractTestNGCucumberTests {}
