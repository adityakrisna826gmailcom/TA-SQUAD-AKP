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
	
	
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[1]")
//	private WebElement previewUploadDokumenBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[1]/img[1]")
	private WebElement previewUploadDokumenBefore;
	
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[1]")
//	private WebElement previewUploadDokumenAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[1]/img[1]")
	private WebElement previewUploadDokumenAfter;
	
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[1]")
//	private WebElement previewUploadDokumenTTD;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[1]/img[1]")
	private WebElement previewUploadDokumenTTD;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement previewDokumenBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]/img[1]")
	private WebElement previewDokumenAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/a[1]/img[1]")
	private WebElement previewDokumenTTD;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement submit;
	//div[@role='alert']
	
//	@FindBy(xpath = "//div[@role='alert']") //TTD Digital Berhasil
//	private WebElement txtValidSubmit;
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]") //TTD Digital Berhasil
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
	
// PreviewUploadDocument
	
	public WebElement getPreviewUploadDokumenBefore() {		
		return this.previewUploadDokumenBefore;
	}
	
	public WebElement getPreviewUploadDokumenAfter() {		
		return this.previewUploadDokumenAfter;
	}
	
	public WebElement getPreviewUploadDokumenTTD() {		
		return this.previewUploadDokumenTTD;
	}
	
	public void rightClickPreviewUploadDokumenBefore() {
		Utils.rightClick(getPreviewUploadDokumenBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewUploadDokumenAfter() {
		Utils.rightClick(getPreviewUploadDokumenAfter(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewUploadDokumenTTD() {
		Utils.rightClick(getPreviewUploadDokumenTTD(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	
// PreviewDocument
	
	public WebElement getPreviewDokumenBefore() {		
		return this.previewDokumenBefore;
	}
	
	public WebElement getPreviewDokumenAfter() {		
		return this.previewDokumenAfter;
	}
	
	public WebElement getPreviewDokumenTTD() {		
		return this.previewDokumenTTD;
	}
	
	public void rightClickPreviewDokumenBefore() {
		Utils.rightClick(getPreviewDokumenBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewDokumenAfter() {
		Utils.rightClick(getPreviewDokumenAfter(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewDokumenTTD() {
		Utils.rightClick(getPreviewDokumenTTD(), driver);
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
	
	
	public boolean msgErrorBPJSCharacter() {
		return (nomBpjs.getAttribute("minlength").toString().contains("13"))  && (nomBpjs.getAttribute("maxlength").contains("13"));
	}
	
	public boolean msgErrorNoKTPCharacter() {
		return (nomKtp.getAttribute("minlength").toString().contains("16"))  && (nomKtp.getAttribute("maxlength").contains("16"));
	}
	
	
	
// BEFORE AFTER TTD DIGITAL
	
	@FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
	private WebElement txtPageLogin;
	
	@FindBy(xpath = "//input[@name='uploadfile']")
	private WebElement chooseFileSatu;
	
	@FindBy(xpath = "//input[@name='uploadfile2']")
	private WebElement chooseFileDua;
	
	@FindBy(xpath = "//input[@value='OK']")
	private WebElement okCompress;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/span[1]")
	private WebElement txtCompress;
	
	@FindBy(xpath = "//h4[@class='panel-title'][normalize-space()='Upload Dokumen']")
	private WebElement lblUploadDokumenTitle;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/span[1]")
	private WebElement lblResult;
	
	
	public void btnOK()
	{
		this.okCompress.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputChooseFileSatu(String pathSatu)
	{
		this.chooseFileSatu.sendKeys(pathSatu);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputChooseFileDua(String pathDua)
	{
		this.chooseFileDua.sendKeys(pathDua);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public WebElement getlblUploadDokumenTitle() {
		return this.lblUploadDokumenTitle;
	}
	
	public String txtSrcPreview(WebElement element) {
		//	src="https://dev.ptdika.com/siloam/new_assets/noimage.png"
		return element.getAttribute("src");
	}
	
	public String txtResult() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, lblResult);
	}
}
