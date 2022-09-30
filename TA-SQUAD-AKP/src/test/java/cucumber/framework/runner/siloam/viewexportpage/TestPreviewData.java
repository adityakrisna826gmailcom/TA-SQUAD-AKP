package cucumber.framework.runner.siloam.viewexportpage;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPreviewData {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestPreviewData() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data")
	public void siloam050_admin_sudah_login_dan_berada_di_halaman_view_data() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    driver.get(Constants.URL_SILOAM_VIEW_ADMIN);
	    extentTest.log(LogStatus.PASS, "Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data");
	}

	@When("Siloam050 Admin Tekan Tombol Preview Data")
	public void siloam050_admin_tekan_tombol_preview_data() {
		viewExportPage.btnPreviewData();
		extentTest.log(LogStatus.PASS, "Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data");
	}

	@Then("Siloam050 Validasi Data Pada Dokumen PDF")
	public void siloam050_validasi_data_pada_dokumen_pdf() {
//		String pathDua = "C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\TA\\Download\\20220930 (1).zip";
//		assertEquals(Utils.getFileSize(pathSatu), Utils.getFileSize(pathDua));
//		extentTest.log(LogStatus.PASS, "Siloam025 Siloam030 Validasi An uncaught Exception was encountered");
	}
}
