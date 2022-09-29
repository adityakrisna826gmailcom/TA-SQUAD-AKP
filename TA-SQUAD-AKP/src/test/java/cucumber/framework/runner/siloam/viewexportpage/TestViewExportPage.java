package cucumber.framework.runner.siloam.viewexportpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestViewExportPage {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestViewExportPage() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@When("Siloam020 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export")
	public void siloam020_admin_sudah_login_dan_berada_di_dalam_halaman_view_dan_export() {
		driver.get(Constants.URL_SILOAM);
	    viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export");
	}

	@And("Siloam020 Admin Memasukkan Start Date")
	public void siloam020_admin_memasukkan_start_date() {
	    viewExportPage.inputStartDate("2022-09-14");
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Memasukkan Start Date");
	}

	@And("Siloam020 Admin Memasukkan End Date")
	public void siloam020_admin_memasukkan_end_date() {
	    viewExportPage.inputEndDate("2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Memasukkan End Date");
	}

	@And("Siloam020 Admin Klik Tombol Filter")
	public void siloam020_admin_klik_tombol_filter() {
	    viewExportPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Klik Tombol Filter");
	}

	@Then("Siloam020 Validasi Tombol Filter")
	public void siloam020_validasi_tombol_filter() {
		String adminName = "1";
		assertEquals(viewExportPage.getTxtSuccessFilter(), adminName);
		extentTest.log(LogStatus.PASS, "Siloam020 Validasi Tombol Filter");
	}
}
