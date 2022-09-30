package cucumber.framework.runner.siloam.viewexportpage;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesTujuan {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestFaskesTujuan() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam060_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam060 Admin Tekan Link Faskes Tujuan")
	public void siloam060_admin_tekan_link_faskes_tujuan() {
		viewExportPage.btnFaskesTujuan();
		extentTest.log(LogStatus.PASS, "Siloam060 Admin Tekan Link Faskes Tujuan");
	}

	@Then("Siloam060 Validasi Gambar Faskes Tujuan")
	public void siloam060_validasi_gambar_faskes_tujuan() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
}
