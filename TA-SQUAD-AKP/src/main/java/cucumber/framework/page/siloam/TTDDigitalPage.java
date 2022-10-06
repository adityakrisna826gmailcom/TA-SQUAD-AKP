package cucumber.framework.page.siloam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*
created_by : Adit
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class TTDDigitalPage extends FormReturnPage {

	private WebDriver driver;
	
	public TTDDigitalPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/566/566_Before_90295f4f6cad49dae9adfad620f2d7df.png')]")
//	private WebElement before;
	
	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/570/570_Before_38a03311082fda907fadea664f171ae5.jpg')]")
	private WebElement before;
	
//	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/566/566_After_f79f39df06147b8eeb69bb3afa142953.png')]")
//	private WebElement after;
	
	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/570/570_After_ab7af79d2bc370e61ac7ba8fe750dd16.jpg')]")
	private WebElement after;
	
//	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/566/566_TTD_0e2f59325af64c759eebd459610f8d30.png')]")
//	private WebElement ttdDigital;
	
	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/570/570_TTD_3c7c831a6ad69474014d79b3b64acb03.jpg')]")
	private WebElement ttdDigital;
	
	
	@FindBy(xpath = "//div[@id='image_preview']/a/img")
	private WebElement beforeFileUpload;
	
	
	@FindBy(xpath = "//tr[2]/td[3]/div/a/img")
	private WebElement afterFileUpload;
	
//	@FindBy(xpath = "//tr[3]/td[3]/div/a/img")
//	private WebElement ttdDigitalFileUpload;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]")
	private WebElement ttdDigitalFileUpload;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@role='alert']") //TTD Digital Berhasil
	private WebElement txtValidSubmit;
	
	
//PAGE NEW
	@FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/new_data']")
	private WebElement pageNew;
		
//DATA
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nama;
		
	@FindBy(xpath = "//input[@id='no_bpjs']")
	private WebElement nomBpjs;
		
	@FindBy(xpath = "//input[@id='no_ktp']")
	private WebElement nomKtp;
		
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
		
	@FindBy(xpath = "//span[@id='select2-ktp_city-container']")
	private WebElement kotaKTP;
		
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtBox;
		
		
	@FindBy(xpath = "//input[@id='origin_faskes']")
	private WebElement faskesAwal;
		
	@FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
	private WebElement faskesTujuan;
		
	@FindBy(xpath = "//textarea[@id='reason']")
	private WebElement alasan;
		
	@FindBy(xpath = "//button[@id='btnEdit']")
	private WebElement edit;
		
	@FindBy(xpath = "//button[@id='btnUpdate']")
	private WebElement update;
		
		
	@FindBy(xpath = "//button[@id='btnCancelUpdate']")
	private WebElement cancelUpdate;
		
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgSuccess;
		
		
//DOKUMEN
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement bfImage;

		

//UPLOAD DOKUMEN

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]/span[1]")	
	private WebElement imgBefore;

	@FindBy(xpath = "//form[@id='fileupload']/div/table/tbody/tr[3]/td[4]/a/i")
	private WebElement uploadFile;
		
	@FindBy(xpath = "//input[@id='file']")
	private WebElement file;
		
	@FindBy(xpath = "//button[@id='btnSaveFoto']")
	private WebElement saveFoto;
		
	@FindBy(xpath = "//button[@class='btn btn-danger pull-left']")
	private WebElement cancelUpload;	
	
	public void btnBefore()
	{
		this.before.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnAfter()
	{
		this.after.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnTTDDigital()
	{
		this.ttdDigital.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnBeforeFileUpload()
	{
		this.beforeFileUpload.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnAfterFileUpload()
	{
		this.afterFileUpload.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnTTDDigitalFileUpload()
	{
		this.ttdDigitalFileUpload.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnSubmit()
	{
		this.submit.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtValidSubmit() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidSubmit);
	}
	
	
	public void update(String nama, String nomBpjs,String nomKtp, String address, String srkotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		Robot robot = new Robot();
		
		if(!nama.equals("")) {
			clearName();
			updateName(nama);
		}
		if(!nomBpjs.equals("")) {
			clearNomBpjs();
			updateNoBPJS(nomBpjs);
		} 
		if(!nomKtp.equals("")) {
			clearNomKtp();
			updateNomKtp(nomKtp);
		}
		if(!address.equals("")) {
			clearAddress();
			updateAddress(address);
		}
		if(!srkotaKTP.equals("")) {
			clickKotaKTP();
			updateKotaKTP(srkotaKTP);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
//			Select skotaKtp = new Select(kotaKTP);
//			skotaKtp.selectByValue(srkotaKTP);
		}
		if(!faskesAwal.equals("")) {
			clearfaskesAwal();
			updateFaskesAwal(faskesAwal);
		}
		if(!faskesTujuan.equals("")) {
			clickFaskesTujuan();
			updateFaskesTujuan(faskesTujuan);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		if(!alasan.equals("")) {
			clearAlasan();
			updateAlasan(alasan);
		}
		
	}

	
//PAGE NEW
	public void menuNew() {
		this.pageNew.click();
	}
	
//DATA	
	
	//Nama
	public String getTxtName() {		
		return nama.getAttribute("value");
	}
	
	public void clearName() {
		this.nama.clear();
	}
	
	public void updateName(String nama) {
		this.nama.sendKeys(nama);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	//No BPJS
	public void clearNomBpjs() {
		this.nomBpjs.clear();
	} 
	
	public void updateNoBPJS(String nomBpjs) {
		this.nomBpjs.sendKeys(nomBpjs);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtNoBPJS() {		
		return nomBpjs.getAttribute("value");
	}
	
	//No KTP
	public void clearNomKtp() {
		this.nomKtp.clear();
	} 
	
	public void updateNomKtp(String nomKtp) {
		this.nomKtp.sendKeys(nomKtp);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtNomKtp() {		
		return nomKtp.getAttribute("value");
	}
	
	//Address
	public void clearAddress() {
		this.address.clear();
	} 
	
	public void updateAddress(String address) {
		this.address.sendKeys(address);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtAddress() {		
		return address.getAttribute("value");
	}
	
	//Kota KTP
	public String getTxtKotaKTP() {		
		return kotaKTP.getAttribute("title");
	}
	
	public void clickKotaKTP() {
		this.kotaKTP.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	} 
	
	public void updateKotaKTP(String kotaKTP) {
		this.txtBox.sendKeys(kotaKTP);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	//Faskes Awal
	public void clearfaskesAwal() {
		this.faskesAwal.clear();
	} 
	
	public void updateFaskesAwal(String faskesAwal) {
		this.faskesAwal.sendKeys(faskesAwal);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtFaskesAwal() {		
		return faskesAwal.getAttribute("value");
	}
	
	//Faskes Tujuan
	public void clickFaskesTujuan() {
		this.faskesTujuan.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateFaskesTujuan(String faskesTujuan) {
		this.txtBox.sendKeys(faskesTujuan);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtFaskesTujuan() {		
		return faskesTujuan.getAttribute("title");
	}
	
	//Alasan
	public void clearAlasan() {
		this.alasan.clear();
	} 
	
	public void updateAlasan(String alasan) {
		this.alasan.sendKeys(alasan);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtAlasan() {		
		return alasan.getAttribute("value");
	}
	
	
	public void btnEdit() {
		this.edit.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnUpdate() {
		this.update.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btncancelUpdate() {
		this.cancelUpdate.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String msgSuccessUpdate() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgSuccess);
	}	
	
	
	
// INVALID EDIT
	
	@FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
	private WebElement txtInvalidNoBPJS;
	
	@FindBy(xpath = "//span[normalize-space()='Field Nomor KTP Harus Diisi!']")
	private WebElement txtInvalidNoKTP;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
	private WebElement txtInvalidAlamat;
	
	@FindBy(xpath = "//span[normalize-space()='Field Faskes Asal Harus Diisi!']")
	private WebElement txtInvalidFaskesAwal;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
	private WebElement txtInvalidAlasan;
	
	
	public String msgInvalidNoBPJS() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidNoBPJS);
	}	
	
	public String msgInvalidNoKTP() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidNoKTP);
	}
	
	public String msgInvalidAlamat() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidAlamat);
	}
	
	public String msgInvalidFaskesAwal() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidFaskesAwal);
	}
	
	public String msgInvalidAlasan() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidAlasan);
	}
	
	public void updateInvalid(String nama, String nomBpjs,String nomKtp, String address, String srkotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		Robot robot = new Robot();
		
		if(nama.equals("")) {
			clearName();
			updateName(nama);
		}
		if(nomBpjs.equals("")) {
			clearNomBpjs();
			updateNoBPJS(nomBpjs);
		} 
		if(nomKtp.equals("")) {
			clearNomKtp();
			updateNomKtp(nomKtp);
		}
		if(address.equals("")) {
			clearAddress();
			updateAddress(address);
		}
		if(srkotaKTP.equals("")) {
			clickKotaKTP();
			updateKotaKTP(srkotaKTP);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
//			Select skotaKtp = new Select(kotaKTP);
//			skotaKtp.selectByValue(srkotaKTP);
		}
		if(faskesAwal.equals("")) {
			clearfaskesAwal();
			updateFaskesAwal(faskesAwal);
		}
		if(faskesTujuan.equals("")) {
			clickFaskesTujuan();
			updateFaskesTujuan(faskesTujuan);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		if(alasan.equals("")) {
			clearAlasan();
			updateAlasan(alasan);
		}
		
	}
	
//	public WebElement getInputBpjs() {
//		return this.nomBpjs;
//	}
//	
//	public WebElement getInputNoKTP() {
//		return this.nomKtp;
//	}
	
	public boolean msgErrorBPJSCharacter() {
		return (nomBpjs.getAttribute("minlength").toString().contains("13"))  && (nomBpjs.getAttribute("maxlength").contains("13"));
	}
	
	public boolean msgErrorNoKTPCharacter() {
		return (nomKtp.getAttribute("minlength").toString().contains("16"))  && (nomKtp.getAttribute("maxlength").contains("16"));
	}
	
}
