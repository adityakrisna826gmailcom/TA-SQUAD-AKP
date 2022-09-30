package cucumber.framework.runner.siloam.viewexportpage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = {
//		"src/test/resources/Features/Siloam/020AdminMelihatDataKaryawan.feature", 
//		"src/test/resources/Features/Siloam/025AdminMelakukanRefresh.feature",
//		"src/test/resources/Features/Siloam/030AdminMelakukanDownload.feature",
//		"src/test/resources/Features/Siloam/035AdminMelakukanExport.feature",
//		"src/test/resources/Features/Siloam/040AdminMenekanView.feature",
//		"src/test/resources/Features/Siloam/045AdminMenekanTombolBack.feature",
		"src/test/resources/Features/Siloam/050AdminMenekanPreviewData.feature",
		"src/test/resources/Features/Siloam/055AdminMenekanLinkFotoFaskesAwal.feature"
		},
glue = "cucumber.framework.runner.siloam.viewexportpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/ViewExportPage.html",
		"json:target/siloam/jsonreport/ViewExportPage.json",
		"junit:target/siloam/junitreport/ViewExportPage.xml"})

public class ViewExportRunner extends AbstractTestNGCucumberTests{}
