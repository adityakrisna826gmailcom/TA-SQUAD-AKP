package cucumber.framework.runner.siloam.viewexportpageoutline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/Features/Siloam/020AdminMelihatDataKaryawan.feature", 
		"src/test/resources/Features/Siloam/025AdminMelakukanRefresh.feature",
		"src/test/resources/Features/Siloam/030AdminMelakukanDownload.feature",
		"src/test/resources/Features/Siloam/035AdminMelakukanExport.feature",
		"src/test/resources/Features/Siloam/040AdminMenekanView.feature",
		"src/test/resources/Features/Siloam/045AdminMenekanTombolBack.feature",
		"src/test/resources/Features/Siloam/050AdminMenekanPreviewData.feature",			
//		"src/test/resources/Features/Siloam/055AdminMenekanLinkFotoFaskesAwal.feature",
//		"src/test/resources/Features/Siloam/060AdminMenekanLinkFotoFaskesTujuan.feature",
		"src/test/resources/Features/Siloam/065AdminMenekanLinkPDFAgreement.feature",
		"src/test/resources/Features/Siloam/075AdminMenekanTombolExportInvalid.feature",
		"src/test/resources/Features/Siloam/080AdminMenekanTombolDownload.feature",
		"src/test/resources/Features/SiloamOutline/070AdminMelihatDataKaryawanInvalid.feature"
		},
glue = "cucumber.framework.runner.siloam.viewexportpageoutline",
monochrome=true,
plugin = {"pretty","html:target/siloamoutline/htmlreport/ViewExportPageInvalid.html",
		"json:target/siloamoutline/jsonreport/ViewExportPageInvalid.json",
		"junit:target/siloamoutline/junitreport/ViewExportPageInvalid.xml"})

public class ViewExportRunnerOutline extends AbstractTestNGCucumberTests {}
