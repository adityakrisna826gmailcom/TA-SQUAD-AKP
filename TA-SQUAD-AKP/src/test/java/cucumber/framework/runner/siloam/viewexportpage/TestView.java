package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : -
updated_date : -
*/


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestView {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestView() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam040 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam040_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam040 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam040 Admin Tekan Tombol View")
	public void siloam040_admin_tekan_tombol_view() {
		viewExportPage.btnView();
	    extentTest.log(LogStatus.PASS, "Siloam040 Admin Tekan Tombol View");
	}

	@Then("Siloam040 Validasi kata View Data")
	public void siloam040_validasi_kata_view_data() {
//		String adminName = "C:\\Users\\NEXSOFT\\Downloads\\20220930.zip";
//		assertEquals(Utils.getCurrentDateWithoutStrip() + ".zip",Utils.getFileNameWithExt(adminName));
//		extentTest.log(LogStatus.PASS, "Siloam040 Validasi kata View Data");
	}
}
