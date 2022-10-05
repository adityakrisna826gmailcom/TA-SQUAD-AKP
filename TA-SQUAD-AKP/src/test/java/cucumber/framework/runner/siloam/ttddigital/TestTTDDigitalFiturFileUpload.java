package cucumber.framework.runner.siloam.ttddigital;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TTDDigitalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDDigitalFiturFileUpload {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static TTDDigitalPage ttdDigital = new TTDDigitalPage();
	
	public TestTTDDigitalFiturFileUpload() {
		driver = TTDDigitalHooksOutline.driver;
		extentTest = TTDDigitalHooksOutline.extentTest;
	}
	
//BEFORE
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload");
	}

	@And("Siloam215 Sales Menekan Gambar Before Fitur File Upload")
	public void siloam215_sales_menekan_gambar_before_fitur_file_upload() {
	    ttdDigital.btnBeforeFileUpload();
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar Before Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar Before Fitur File Upload")
	public void siloam215_validasi_gambar_before_fitur_file_upload() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
//AFTER
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload_after() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After");
	}

	@And("Siloam215 Sales Menekan Gambar After Fitur File Upload")
	public void siloam215_sales_menekan_gambar_after_fitur_file_upload() {
	    ttdDigital.btnAfterFileUpload();
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar After Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar After Fitur File Upload")
	public void siloam215_validasi_gambar_after_fitur_file_upload() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	
//TTD DIGITAL
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital");
	}

	@And("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload")
	public void siloam215_sales_menekan_gambar_ttd_digital_fitur_file_upload() {
	    ttdDigital.btnTTDDigitalFileUpload();
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar TTD Digital Fitur File Upload")
	public void siloam215_validasi_gambar_ttd_digital_fitur_file_upload() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
}
