package cucumber.framework.runner.siloam.ttddigital;

import static org.testng.Assert.assertEquals;
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


public class TestTTDPageKombinasiLima {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TTDDigitalPage ttdDigital = new TTDDigitalPage();
	private boolean isNamaEmpty;
	private boolean isBpjsEmpty;
	private boolean isNoKTPEmpty;
	private boolean isAlamatEmpty;
	private boolean isKotaKTPEmpty;
	private boolean isFaskesAwalEmpty;
	private boolean isFaskesTujuanEmpty;
	private boolean isAlasanEmpty;
	private String strUpdateName;
	private String strUpdateBpjs;
	private String strUpdateNoKTP;
	private String strUpdateAlamat;
	private String strUpdateKotaKTP;
	private String strUpdateFaskesAwal;
	private String strUpdateFaskesTujuan;
	private String strUpdateAlasan;
	
	public TestTTDPageKombinasiLima() {
		driver = TTDDigitalHooksOutline.driver;
		extentTest = TTDDigitalHooksOutline.extentTest;
		this.isNamaEmpty = true;
		this.isBpjsEmpty = true;
		this.isNoKTPEmpty = true;
		this.isAlamatEmpty = true;
		this.isKotaKTPEmpty = true;
		this.isFaskesAwalEmpty = true;
		this.isFaskesTujuanEmpty = true;
		this.isAlasanEmpty = true;
	}
	
	
	@When("Siloam120 Sales Mengakses Halaman Website")
	public void siloam120_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		extentTest.log(LogStatus.PASS, "Siloam120 Sales Mengakses Halaman Website");
	}

	@Then("Siloam120 Validasi Sales Masuk Ke Halaman TTD Digital")
	public void siloam120_validasi_sales_masuk_ke_halaman_ttd_digital() {
	    driver.get("https://dev.ptdika.com/siloam/sales/input/ttd_digital2/550");
		extentTest.log(LogStatus.PASS, "Siloam120 Validasi Sales Masuk Ke Halaman TTD Digital");
	}

	@When("Siloam120 Sales Tekan Tombol Edit")
	public void siloam120_sales_tekan_tombol_edit() {
		ttdDigital.btnEdit();
		extentTest.log(LogStatus.PASS, "Siloam115 Sales Tekan Tombol Edit");
	}

	@And("^Siloam120 Sales Melakukan Update Pada (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void siloam120_sales_melakukan_update_pada_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		if(!nama.equals("")) {
			this.isNamaEmpty = false;
		}
		if(!nomBpjs.equals("")) {
			this.isBpjsEmpty = false;
		} 
		if(!nomKtp.equals("")) {
			this.isNoKTPEmpty = false;
		}
		if(!address.equals("")) {
			this.isAlamatEmpty = false;
		}
		if(!kotaKTP.equals("")) {
			this.isKotaKTPEmpty = false;	
		}
		if(!faskesAwal.equals("")) {
			this.isFaskesAwalEmpty = false;
		}
		if(!faskesTujuan.equals("")) {
			this.isFaskesTujuanEmpty = false;
		}
		if(!alasan.equals("")) {
			this.isAlasanEmpty = false;
		}
		
		strUpdateName = nama;
		strUpdateBpjs = nomBpjs;
		strUpdateNoKTP = nomKtp;
		strUpdateAlamat = address;
		strUpdateKotaKTP = kotaKTP;
		strUpdateFaskesAwal = faskesAwal;
		strUpdateFaskesTujuan = faskesTujuan;
		strUpdateAlasan = alasan;
		
		
		ttdDigital.update(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
		extentTest.log(LogStatus.PASS, "Siloam120 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, address, kotaKTP, faskesAwal, faskesTujuan, dan alasan");
	}

	@And("Siloam120 Sales tekan tombol Simpan")
	public void siloam120_sales_tekan_tombol_simpan() {
		ttdDigital.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam120 Sales tekan tombol Simpan");
	}

	@Then("Siloam120 Validasi Data Tersimpan Dan Form Ter-update")
	public void siloam120_validasi_data_tersimpan_dan_form_ter_update() {
		String txtExpected = "Data berhasil Di Simpan";
		
		if(!this.isNamaEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdDigital.getTxtName(), strUpdateName);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		} 
		if (!this.isBpjsEmpty) {
			System.out.println(ttdDigital.msgSuccessUpdate());
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdDigital.getTxtNoBPJS(), strUpdateBpjs);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isNoKTPEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdDigital.getTxtNomKtp(), strUpdateNoKTP);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}

		if (!this.isAlamatEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdDigital.getTxtAddress(), strUpdateAlamat);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isKotaKTPEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertTrue(ttdDigital.getTxtKotaKTP().contains(strUpdateKotaKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isFaskesAwalEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdDigital.getTxtFaskesAwal(), strUpdateFaskesAwal);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isFaskesTujuanEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertTrue(ttdDigital.getTxtFaskesTujuan().contains(strUpdateFaskesTujuan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isAlasanEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdDigital.getTxtAlasan(), strUpdateAlasan);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		extentTest.log(LogStatus.PASS, "Siloam120 Validasi Data Tersimpan Dan Form Ter-update");
	}
	
}
