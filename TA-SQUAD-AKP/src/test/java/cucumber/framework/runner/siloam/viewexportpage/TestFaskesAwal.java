package cucumber.framework.runner.siloam.viewexportpage;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesAwal {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestFaskesAwal() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam055_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam055 Admin Tekan Link Faskes Awal")
	public void siloam055_admin_tekan_link_faskes_awal() {
		viewExportPage.btnFaskesAwal();
		extentTest.log(LogStatus.PASS, "Siloam055 Admin Tekan Link Faskes Awal");
	}

	@Then("Siloam055 Validasi Gambar Faskes Awal")
	public void siloam055_validasi_gambar_faskes_awal() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
}
