package cucumber.framework.runner.siloam.viewexportpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDownload {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestDownload() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam030 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam030_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-1", "2022-09-26");
	    extentTest.log(LogStatus.PASS, "Siloam030 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam030 Admin Tekan Tombol Download")
	public void siloam030_admin_tekan_tombol_download() {
		viewExportPage.btnDownload();
	    extentTest.log(LogStatus.PASS, "Siloam030 Admin Tekan Tombol Download");
	}

	@Then("Siloam030 Validasi An uncaught Exception was encountered")
	public void siloam030_validasi_an_uncaught_exception_was_encountered() {
		String adminName = "An uncaught Exception was encountered";
		assertEquals(viewExportPage.getTxtSuccessDownload(), adminName);
		extentTest.log(LogStatus.PASS, "Siloam025 Siloam030 Validasi An uncaught Exception was encountered");
	}
}
