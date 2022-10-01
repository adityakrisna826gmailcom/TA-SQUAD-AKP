package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : -
updated_date : -
*/


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPDFAgreement {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestPDFAgreement() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam065_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login("admindika", "d1k4@passw0rd");
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam065 Admin Tekan Link PDF Agreement")
	public void siloam060_admin_tekan_link_pdf_agreement() throws AWTException {
		viewExportPage.btnPDFAgreement();
		Utils.tabEnter();
		viewExportPage.filter("2022-09-14", "2022-09-18");
		viewExportPage.btnPDFAgreement();
		Utils.tabEnter();
		extentTest.log(LogStatus.PASS, "Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@Then("Siloam065 Validasi PDF Agreement")
	public void siloam060_validasi_pdf_agreement() {
		String pathSatu = "C:\\Users\\NEXSOFT\\Downloads\\350_agreement_1663523732.pdf";
		String pathDua = "C:\\Users\\NEXSOFT\\Downloads\\350_agreement_1663523732 (1).pdf";
		assertTrue(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Siloam065 Validasi PDF Agreement");
	}
	
}
