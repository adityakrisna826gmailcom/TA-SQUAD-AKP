package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : -
updated_date : -
*/


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRefresh {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestRefresh() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam025 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam025_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam025 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam025 Admin Tekan Tombol Refresh")
	public void siloam025_admin_tekan_tombol_refresh() {
	    viewExportPage.btnRefresh();
	    extentTest.log(LogStatus.PASS, "Siloam025 Admin Tekan Tombol Refresh");
	}

	@Then("Siloam025 Validasi view & export pada halaman view & export")
	public void siloam025_validasi_view_export_pada_halaman_view_export() {
		String adminName = "View & Export";
		assertEquals(viewExportPage.getTxtSuccessRefresh(), adminName);
		extentTest.log(LogStatus.PASS, "Siloam025 Validasi view & export pada halaman view & export");
	}
	
}
