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

public class TestExportInvalid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestExportInvalid() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	
	@Given("Siloam075 Admin Berada Di Halaman View Export")
	public void siloam075_admin_berada_di_halaman_view_export() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    extentTest.log(LogStatus.PASS, "Siloam075 Admin Berada Di Halaman View Export");
	}

	@When("Siloam075 Admin Tekan Tombol Export Start End Date Empty")
	public void siloam075_admin_tekan_tombol_export_start_end_date_empty() {
	    viewExportPage.btnExport();
	    extentTest.log(LogStatus.PASS, "Siloam075 Admin Tekan Tombol Export Start End Date Empty");
	}

	@Then("Siloam075 Validasi Sukses Export Start End Date Empty")
	public void siloam075_validasi_sukses_export_start_end_date_empty() {
		String adminName = "Danger! Mohon isi start_date dan end_date terlebih dahulu!!!";
		assertTrue(viewExportPage.getTxtInvalidExportEmpty().contains(adminName));
		extentTest.log(LogStatus.PASS, "Siloam075 Validasi Sukses Export Start End Date Empty");
	}

	
	@Given("Siloam075 Admin Berada Di Halaman View Export Dan Memasukkan Start End Date Dan Tekan Filter")
	public void siloam075_admin_berada_di_halaman_view_export_dan_memasukkan_start_end_date_dan_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-10-01", "2022-10-01");
	    extentTest.log(LogStatus.PASS, "Siloam075 Admin Berada Di Halaman View Export Dan Memasukkan Start End Date Dan Tekan Filter");
	}

	@When("Siloam075 Admin Tekan Tombol Export Data Empty")
	public void siloam075_admin_tekan_tombol_export_data_empty() {
		viewExportPage.btnExport();
	    extentTest.log(LogStatus.PASS, "Siloam075 Admin Tekan Tombol Export Data Empty");
	}

	@Then("Siloam075 Validasi Sukses Export Data Empty")
	public void siloam075_validasi_sukses_export_data_empty() {
		String adminName = "Danger! Data Tidak Ada!!!";
		assertTrue(viewExportPage.getTxtInvalidExportEmpty().contains(adminName));
		extentTest.log(LogStatus.PASS, "Siloam075 Validasi Sukses Export Start End Date Empty");
	}
}
