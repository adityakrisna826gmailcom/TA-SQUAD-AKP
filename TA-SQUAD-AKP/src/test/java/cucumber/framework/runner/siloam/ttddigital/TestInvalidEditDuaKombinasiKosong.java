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

/*
created_by : Adit
created_date : 05/10/2022
updated_by : -
updated_date : -
*/

public class TestInvalidEditDuaKombinasiKosong {

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
	
	public TestInvalidEditDuaKombinasiKosong() {
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
	
	@When("Siloam130 Sales Mengakses Halaman Website")
	public void siloam130_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		extentTest.log(LogStatus.PASS, "Siloam130 Sales Mengakses Halaman Website");
	}

	@Then("Siloam130 Validasi Sales Masuk Ke Halaman TTD Digital")
	public void siloam130_validasi_sales_masuk_ke_halaman_ttd_digital() {
		driver.get("https://dev.ptdika.com/siloam/sales/input/update/318");
		extentTest.log(LogStatus.PASS, "Siloam130 Validasi Sales Masuk Ke Halaman TTD Digital");
	}

	@When("Siloam130 Sales Tekan Tombol Edit")
	public void siloam130_sales_tekan_tombol_edit() {
		ttdDigital.btnEdit();
		extentTest.log(LogStatus.PASS, "Siloam130 Sales Tekan Tombol Edit");
	}

	@And("^Siloam130 Sales Melakukan Update Pada (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void siloam130_sales_melakukan_update_pada_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
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
		
		
		ttdDigital.updateInvalid(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
		extentTest.log(LogStatus.PASS, "Siloam130 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, address, kotaKTP, faskesAwal, faskesTujuan, dan alasan");
	}

	@And("Siloam130 Sales tekan tombol Simpan")
	public void siloam130_sales_tekan_tombol_simpan() {
		ttdDigital.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam130 Sales tekan tombol Simpan");
	}

	@Then("Siloam130 Validasi Pesan Harus Isi Field")
	public void siloam130_validasi_pesan_harus_isi_field() {
		String txtExpectedNama = "Data berhasil Di Simpan";
		String txtExpectedNoBPJS = "The Nomor BPJS already exist.";
		String txtExpectedNoKTP = "Field Nomor KTP Harus Diisi!";
		String txtExpectedAlamat = "Field Alamat Harus Diisi!";
		String txtExpectedKotaKTP = "Data berhasil Di Simpan";
		String txtExpectedFaskesAwal = "Field Faskes Asal Harus Diisi!";
		String txtExpectedFaskesTujuan = "Data berhasil Di Simpan";
		String txtExpectedAlasan = "Field Alasan Harus Diisi!";
		
		if(this.isNamaEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpectedNama));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		} 
		if (this.isBpjsEmpty) {
			assertTrue(ttdDigital.msgInvalidNoBPJS().contains(txtExpectedNoBPJS));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isNoKTPEmpty) {
			assertTrue(ttdDigital.msgInvalidNoKTP().contains(txtExpectedNoKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}

		if (this.isAlamatEmpty) {
			assertTrue(ttdDigital.msgInvalidAlamat().contains(txtExpectedAlamat));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isKotaKTPEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpectedKotaKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isFaskesAwalEmpty) {
			assertTrue(ttdDigital.msgInvalidFaskesAwal().contains(txtExpectedFaskesAwal));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isFaskesTujuanEmpty) {
			assertTrue(ttdDigital.msgSuccessUpdate().contains(txtExpectedFaskesTujuan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isAlasanEmpty) {
			assertTrue(ttdDigital.msgInvalidAlasan().contains(txtExpectedAlasan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		extentTest.log(LogStatus.PASS, "Siloam130 Validasi Pesan Harus Isi Field");
	}
}
