package cucumber.framework.runner.siloam.viewexportpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExport {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestExport() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam035 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam035_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam035 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam035 Admin Tekan Tombol Export")
	public void siloam035_admin_tekan_tombol_export() {
		viewExportPage.btnExport();
		viewExportPage.filter("2022-09-8", "2022-09-10");
		viewExportPage.btnExport();
	    extentTest.log(LogStatus.PASS, "Siloam035 Admin Tekan Tombol Export");
	}

	@Then("Siloam035 Validasi Sukses Export")
	public void siloam035_validasi_sukses_export() {
		String pathSatu = "C:\\Users\\NEXSOFT\\Downloads\\data_export.xls";
		String pathDua = "C:\\Users\\NEXSOFT\\Downloads\\data_export (1).xls";
		assertFalse(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Siloam035 Validasi Sukses Export");
	}
}
