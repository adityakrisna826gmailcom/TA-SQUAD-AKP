package cucumber.framework.runner.siloam.viewexportpageoutline;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : -
updated_date : -
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.util.Util;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesAwal {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestFaskesAwal() throws IOException {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
//		Utils.deleteFile("C:\\Users\\NEXSOFT\\Downloads\\25_Before_349cbe1bb2c8acbbebdc16571073ebd4.jpg");
	}
	
	@Given("Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam055_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM, Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    viewExportPage.filter("2022-10-08", "2022-10-08");
	    extentTest.log(LogStatus.PASS, "Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam055 Admin Tekan Link Faskes Awal")
	public void siloam055_admin_tekan_link_faskes_awal() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		String txtSrc = viewExportPage.txtHrefPreview(viewExportPage.getFaskesAwal());
		String getNamePic = txtSrc.substring(txtSrc.length()-47,txtSrc.length());
		System.out.println(getNamePic);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + getNamePic);
		
		viewExportPage.rightClickFaskesAwal();
		
		Utils.tabEnterDown(0, 4, 2);
		
//		viewExportPage.btnFaskesAwal();
		
		extentTest.log(LogStatus.PASS, "Siloam055 Admin Tekan Link Faskes Awal");
	}

	@Then("Siloam055 Validasi Gambar Faskes Awal")
	public void siloam055_validasi_gambar_faskes_awal() {
		String pathWebPicBefore = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\574_Before_7c056ce6865a9801a7022cb702cfff4c.jpg";
		String pathRealPicBefore = "C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\TA\\Gambar\\Upload Foto Faskes Awal.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		
		viewExportPage.inputChooseFileSatu(pathWebPicBefore);
		viewExportPage.inputChooseFileDua(pathRealPicBefore);
		viewExportPage.btnOK();
		
		String sub = viewExportPage.txtResult().toString().substring(0,4);
		double dNum = Double.parseDouble(sub);
		
		assertTrue(dNum > 90);
		extentTest.log(LogStatus.PASS, "Siloam055 Validasi Gambar Faskes Awal");
	}
}
