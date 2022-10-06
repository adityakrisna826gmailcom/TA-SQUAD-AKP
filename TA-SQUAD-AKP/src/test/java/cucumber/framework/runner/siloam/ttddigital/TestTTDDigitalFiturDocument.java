package cucumber.framework.runner.siloam.ttddigital;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TTDDigitalPage;
import cucumber.framework.utils.Utils;
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
	public void siloam210_sales_menekan_gambar_before_fitur_document() throws AWTException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/570/570_Before_d6afc10be16d20986b0306d476a4b70c.jpg')]"));
		actions.contextClick(elementLocator).perform();
		
		Utils.tabEnterDown(0, 8, 2);
		
//	    ttdDigital.btnBefore();
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
	public void siloam210_sales_menekan_gambar_after_fitur_document() throws AWTException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/570/570_After_ab7af79d2bc370e61ac7ba8fe750dd16.jpg')]"));
		actions.contextClick(elementLocator).perform();
		
		Utils.tabEnterDown(0, 8, 2);
		
//		ttdDigital.btnAfter();
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
	public void siloam210_sales_menekan_gambar_ttd_digital_fitur_document() throws AWTException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/570/570_TTD_3c7c831a6ad69474014d79b3b64acb03.jpg')]"));
		actions.contextClick(elementLocator).perform();
		
		Utils.tabEnterDown(0, 8, 2);
		
//		ttdDigital.btnTTDDigital();
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar TTD Digital Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar TTD Digital Fitur Document")
	public void siloam210_validasi_gambar_ttd_digital_fitur_document() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

}
