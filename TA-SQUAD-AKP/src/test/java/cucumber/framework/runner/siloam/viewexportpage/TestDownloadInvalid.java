package cucumber.framework.runner.siloam.viewexportpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDownloadInvalid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestDownloadInvalid() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam080 Admin Berada Di Halaman View Export")
	public void siloam080_admin_berada_di_halaman_view_export() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    extentTest.log(LogStatus.PASS, "Siloam080 Admin Berada Di Halaman View Export");
	}

	@When("Siloam080 Admin Tekan Tombol Download Start End Date Empty")
	public void siloam080_admin_tekan_tombol_download_start_end_date_empty() {
		 viewExportPage.btnDownload();
		 extentTest.log(LogStatus.PASS, "Siloam080 Admin Tekan Tombol Download Start End Date Empty");
	}

	@Then("Siloam080 Validasi Sukses Export Start End Date Empty")
	public void siloam080_validasi_sukses_export_start_end_date_empty() {
		String adminName = "Danger";
		assertTrue(viewExportPage.getTxtInvalidDownload().contains(adminName));
		extentTest.log(LogStatus.PASS, "Siloam080 Validasi Sukses Export Start End Date Empty");
	}

	@Given("Siloam080 Admin Berada Di Halaman View Export Dan Memasukkan Start End Date Dan Tekan Filter")
	public void siloam080_admin_berada_di_halaman_view_export_dan_memasukkan_start_end_date_dan_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-10-01", "2022-10-01");
	    extentTest.log(LogStatus.PASS, "Siloam080 Admin Berada Di Halaman View Export Dan Memasukkan Start End Date Dan Tekan Filter");
	}

	@When("Siloam080 Admin Tekan Tombol Download Data Empty")
	public void siloam080_admin_tekan_tombol_download_data_empty() {
		viewExportPage.btnDownload();
		extentTest.log(LogStatus.PASS, "Siloam080 Admin Tekan Tombol Download Data Empty");
	}

	@Then("Siloam080 Validasi Sukses Download Data Empty")
	public void siloam080_validasi_sukses_download_data_empty() {
		String adminName = "Danger";
		assertTrue(viewExportPage.getTxtInvalidDownloadEmpty().contains(adminName));
		extentTest.log(LogStatus.PASS, "Siloam080 Validasi Sukses Download Data Empty");
	}
}
