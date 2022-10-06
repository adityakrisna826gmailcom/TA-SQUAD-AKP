package cucumber.framework.runner.siloam.formreturnpage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/


@CucumberOptions(
features = {
		"src/test/resources/Features/Siloam/085FormReturnSalesFilter.feature",
		"src/test/resources/Features/Siloam/090FormReturnSalesShowPage.feature",
		"src/test/resources/Features/Siloam/093FormReturnSalesCariData.feature",
		"src/test/resources/Features/Siloam/095FormReturnSalesInvalidSearch.feature",
		"src/test/resources/Features/Siloam/097FormReturnSalesTekanAksi.feature",
		"src/test/resources/Features/Siloam/099FormReturnSalesTekanFilterInvalid.feature",
		"src/test/resources/Features/Siloam/205SalesMenekanTombolLogout.feature"
		},
glue = "cucumber.framework.runner.siloam.formreturnpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/FormReturnFilterPage.html",
		"json:target/siloam/jsonreport/FormReturnFilterPage.json",
		"junit:target/siloam/junitreport/FormReturnFilterPage.xml"})


public class FormReturnRunner extends AbstractTestNGCucumberTests{}
