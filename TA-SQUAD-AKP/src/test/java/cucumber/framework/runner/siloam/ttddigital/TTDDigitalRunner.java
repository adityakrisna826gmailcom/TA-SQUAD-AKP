package cucumber.framework.runner.siloam.ttddigital;

/*
created_by : Adit
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
//		"src/test/resources/Features/Siloam/120UpdateDataSalesLimaKombinasi.feature",
//		"src/test/resources/Features/Siloam/125SalesInvalidEditDataSatuKombinasiKosong.feature",
//		"src/test/resources/Features/Siloam/130SalesInvalidEditDataDuaKombinasiKosong.feature",
//		"src/test/resources/Features/Siloam/135SalesInvalidEditDataTigaKombinasiKosong.feature",
//		"src/test/resources/Features/Siloam/140SalesInvalidEditDataEmpatKombinasiKosong.feature",
//		"src/test/resources/Features/Siloam/145SalesInvalidEditDataLimaKombinasiKosong.feature",
//		"src/test/resources/Features/Siloam/150SalesInvalidEditDataBPJSKurangKarakter.feature",
//		"src/test/resources/Features/Siloam/155SalesInvalidEditDataNoKTPKurangKarakter.feature",
		"src/test/resources/Features/Siloam/210TTDDigitalFiturDocument.feature",
		"src/test/resources/Features/Siloam/215TTDDigitalFiturFileUpload.feature",
//		"src/test/resources/Features/Siloam/220TTDDigitalMenekanSubmit.feature"
		},
glue = "cucumber.framework.runner.siloam.ttddigital",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/TTDDigitalPage.html",
		"json:target/siloam/jsonreport/TTDDigitalPage.json",
		"junit:target/siloam/junitreport/TTDDigitalPage.xml"})


public class TTDDigitalRunner extends AbstractTestNGCucumberTests{}
