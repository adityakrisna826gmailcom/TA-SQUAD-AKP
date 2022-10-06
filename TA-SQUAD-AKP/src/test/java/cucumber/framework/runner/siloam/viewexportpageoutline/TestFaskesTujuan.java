package cucumber.framework.runner.siloam.viewexportpageoutline;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : -
updated_date : -
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesTujuan {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestFaskesTujuan() throws IOException {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
		Utils.deleteFile("C:\\Users\\NEXSOFT\\Downloads\\350_After_6ae66d27de999857d951a4bbd843af43.png");
//		Utils.deleteFile("");
	}
	
	@Given("Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam060_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM, Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-09-14", "2022-09-18");
	    extentTest.log(LogStatus.PASS, "Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam060 Admin Tekan Link Faskes Tujuan")
	public void siloam060_admin_tekan_link_faskes_tujuan() throws AWTException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.linkText("Foto Faskes Tujuan"));
		actions.contextClick(elementLocator).perform();
		
//		Utils.rightClick("Foto Faskes Awal");
		
		Utils.tabEnterDown(0, 4, 2);
		
//		viewExportPage.btnFaskesTujuan();
		extentTest.log(LogStatus.PASS, "Siloam060 Admin Tekan Link Faskes Tujuan");
	}

	@Then("Siloam060 Validasi Gambar Faskes Tujuan")
	public void siloam060_validasi_gambar_faskes_tujuan() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
}
