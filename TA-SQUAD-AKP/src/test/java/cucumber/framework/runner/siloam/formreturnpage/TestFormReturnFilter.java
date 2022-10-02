package cucumber.framework.runner.siloam.formreturnpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.FormReturnPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/


public class TestFormReturnFilter {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnFilter() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}
	
	@When("Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Complete")
	public void siloam085_sales_sudah_login_dan_berada_di_halaman_form_return_complete() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login("D6200927", "1997-10-23");
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export");
	}

	@And("Siloam085 Sales Input Start Date Complete")
	public void siloam085_sales_input_start_date_complete() {
	    formReturnPage.btnStartDate();
	    formReturnPage.btnPilihTanggalStart();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Start Date Complete");
	}

	@And("Siloam085 Sales Input End Date Complete")
	public void siloam085_sales_input_end_date_complete() {
		formReturnPage.btnEndDate();
	    formReturnPage.btnPilihTanggalEnd();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input End Date Complete");
	}

	@And("Siloam085 Sales Input Status Complete")
	public void siloam085_sales_input_status_complete() {
	    formReturnPage.filterComplete("Complete");
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Status Complete");
	}

	@And("Siloam085 Sales Tekan Tombol Filter Complete")
	public void siloam085_sales_tekan_tombol_filter_complete() {
	    formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Tekan Tombol Filter Complete");
	}

	@Then("Siloam085 Validasi data complete tampil pada halaman form return")
	public void siloam085_validasi_data_complete_tampil_pada_halaman_form_return() {
		String adminName = "1";
		assertEquals(formReturnPage.getTxtSuccessFilter(), adminName);
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi data complete tampil pada halaman form return");
	}
}
