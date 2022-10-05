package cucumber.framework.runner.siloam.ttddigital;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TTDDigitalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDDigitalFiturDocument {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static TTDDigitalPage ttdDigital = new TTDDigitalPage();
	
	public TestTTDDigitalFiturDocument() {
		driver = TTDDigitalHooksOutline.driver;
		extentTest = TTDDigitalHooksOutline.extentTest;
	}
	
//BEFORE
	
	@When("Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document")
	public void siloam210_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_document() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL);
		extentTest.log(LogStatus.PASS, "Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document");
	}

	@And("Siloam210 Sales Menekan Gambar Before Fitur Document")
	public void siloam210_sales_menekan_gambar_before_fitur_document() {
	    ttdDigital.btnBefore();
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar Before Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar Before Fitur Document")
	public void siloam210_validasi_gambar_before_fitur_document() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	
//AFTER
	
	@When("Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document After")
	public void siloam210_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_document_after() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL);
		extentTest.log(LogStatus.PASS, "Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document");
	}

	@And("Siloam210 Sales Menekan Gambar After Fitur Document")
	public void siloam210_sales_menekan_gambar_after_fitur_document() {
		ttdDigital.btnAfter();
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar After Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar After Fitur Document")
	public void siloam210_validasi_gambar_after_fitur_document() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	
//TTD DIGITAL
	
	@When("Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document TTD Digital")
	public void siloam210_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_document_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL);
		extentTest.log(LogStatus.PASS, "Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document TTD Digital");
	}

	@And("Siloam210 Sales Menekan Gambar TTD Digital Fitur Document")
	public void siloam210_sales_menekan_gambar_ttd_digital_fitur_document() {
		ttdDigital.btnTTDDigital();
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar TTD Digital Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar TTD Digital Fitur Document")
	public void siloam210_validasi_gambar_ttd_digital_fitur_document() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

}
