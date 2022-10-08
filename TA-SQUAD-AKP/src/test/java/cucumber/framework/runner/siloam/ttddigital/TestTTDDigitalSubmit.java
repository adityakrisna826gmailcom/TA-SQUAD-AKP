package cucumber.framework.runner.siloam.ttddigital;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TTDDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDDigitalSubmit {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static TTDDigitalPage ttdDigital = new TTDDigitalPage();
	
	public TestTTDDigitalSubmit() {
		driver = TTDDigitalHooksOutline.driver;
		extentTest = TTDDigitalHooksOutline.extentTest;
	}
	
	@When("Siloam220 Sales Sudah Login")
	public void siloam220_sales_sudah_login() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
//		driver.get("https://dev.ptdika.com/siloam/sales/input/ttd_digital2/315"); //Untuk Runing Presentasi 
		driver.get("https://dev.ptdika.com/siloam/sales/input/ttd_digital2/586");
		extentTest.log(LogStatus.PASS, "Siloam220 Sales Sudah Login");
	    // https://dev.ptdika.com/siloam/sales/input/ttd_digital2/315
	}

	@And("Siloam220 Sales Menekan Submit")
	public void siloam220_sales_menekan_submit() {
		Utils.scrollDownToButtom(driver);
	    System.out.println("Berhasil Submit");
	    ttdDigital.btnSubmit();
	    extentTest.log(LogStatus.PASS, "Siloam220 Sales Menekan Submit");
	}

	@And("Siloam220 Sales Menekan Tombol OK")
	public void siloam220_sales_menekan_tombol_ok() throws AWTException {
		System.out.println("Berhasil OKE");
		Utils.tabEnterDown(0, 0, 1);
	}

	@Then("Siloam220 Validasi Sales Submit Berhasil")
	public void siloam220_validasi_sales_submit_berhasil() {
	    String txtExpected = "TTD Digital Berhasil"; 
	    assertTrue(ttdDigital.getTxtValidSubmit().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam220 Validasi Sales Submit Berhasil");
	}
		
}
