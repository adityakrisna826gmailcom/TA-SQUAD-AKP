package cucumber.framework.runner.siloam.viewexportpageoutline;

import static org.testng.Assert.assertTrue;

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
//		Utils.deleteFile("C:\\Users\\NEXSOFT\\Downloads\\25_After_79a852a69a56998a45e9eb998ad98b05.jpeg");
	}
	
	@Given("Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam060_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM, Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-10-07", "2022-10-07");
	    extentTest.log(LogStatus.PASS, "Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam060 Admin Tekan Link Faskes Tujuan")
	public void siloam060_admin_tekan_link_faskes_tujuan() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		String txtSrc = viewExportPage.txtHrefPreview(viewExportPage.getFaskesTujuan());
		String getNamePic = txtSrc.substring(txtSrc.length()-46,txtSrc.length());
		System.out.println(getNamePic);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + getNamePic);
		
		viewExportPage.rightClickFaskesTujuan();
		
		Utils.tabEnterDown(0, 4, 2);
		
//		viewExportPage.btnFaskesTujuan();
		extentTest.log(LogStatus.PASS, "Siloam060 Admin Tekan Link Faskes Tujuan");
	}

	@Then("Siloam060 Validasi Gambar Faskes Tujuan")
	public void siloam060_validasi_gambar_faskes_tujuan() {
		String pathWebPicBefore = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\574_After_37088a4e9bb4c18bcb8f000978097d19.jpg";
		String pathRealPicBefore = "C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\TA\\Gambar\\Upload Foto Faskes Tujuan.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		
		viewExportPage.inputChooseFileSatu(pathWebPicBefore);
		viewExportPage.inputChooseFileDua(pathRealPicBefore);
		viewExportPage.btnOK();
		
		String sub = viewExportPage.txtResult().toString().substring(0,4);
		double dNum = Double.parseDouble(sub);
		
		assertTrue(dNum > 90);
		extentTest.log(LogStatus.PASS, "Siloam060 Validasi Gambar Faskes Tujuan");
	}
}
