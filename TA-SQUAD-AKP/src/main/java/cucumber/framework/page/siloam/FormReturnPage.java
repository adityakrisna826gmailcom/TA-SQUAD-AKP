package cucumber.framework.page.siloam;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : -
updated_date : -
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class FormReturnPage extends ViewExportPage{

private WebDriver driver;
	
	
	public FormReturnPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnNew;
	
	@FindBy(xpath = "//input[@id='tgl']")
	private WebElement startDate;
	
	@FindBy(xpath = "//th[normalize-space()='October 2022']")
	private WebElement pilihBulan;
	
	@FindBy(xpath = "//span[@class='month active']")
	private WebElement pilihSeptember;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
	private WebElement pilihBack;
	
	@FindBy(xpath = "//td[normalize-space()='14']")
	private WebElement pilihTanggalStart;
	
	@FindBy(xpath = "//input[@id='tgl2']")
	private WebElement endDate;
	
	@FindBy(xpath = "//select[@id='status']")
	private WebElement status;
	
	@FindBy(xpath = "//span[@id='select2-status-container']")
	private WebElement btnStatus;
	
	@FindBy(xpath = "//td[normalize-space()='27']")
	private WebElement pilihTanggalEnd;
	
	
	@FindBy(id = "btn-reset")
	private WebElement reset;
	
	@FindBy(id = "btn-filter")
	private WebElement filter;
	
	@FindBy(xpath = "//td[normalize-space()='1']")
	private WebElement txtValidasiFilter;
	
	@FindBy(xpath = "//select[@name='table_length']")
	private WebElement show;
	
	@FindBy(xpath = "//a[normalize-space()='Next']")
	private WebElement next;
	
	@FindBy(xpath = "//a[normalize-space()='Previous']")
	private WebElement previous;
	
	@FindBy(xpath = "//td[normalize-space()='11']")
	private WebElement txtValidNextSepuluh;
	
	@FindBy(xpath = "//td[normalize-space()='10']")
	private WebElement txtValidShowSepuluh;
	
	@FindBy(xpath = "//td[normalize-space()='25']")
	private WebElement txtValidShowDuaLima;
	
	@FindBy(xpath = "//td[normalize-space()='26']")
	private WebElement txtValidNextDualima;
	
	@FindBy(xpath = "//td[normalize-space()='50']")
	private WebElement txtValidShowLimaPuluh;
	
	@FindBy(xpath = "//td[normalize-space()='51']")
	private WebElement txtValidNextLimaPuluh;
	
	@FindBy(xpath = "//td[normalize-space()='100']")
	private WebElement txtValidShowSeratus;
	
	@FindBy(xpath = "//td[normalize-space()='101']")
	private WebElement txtValidNextSeratus;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath = "//span[@id='btnSearch']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//i[@class='fa fa-history']")
	private WebElement refresh;
	
	
	
	public void filterPending(String pending)
	{
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPending = new Select(status);
		sPending.selectByValue(pending);
		
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void filterComplete(String complete)
	{
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sComplete = new Select(status);
		sComplete.selectByValue(complete);
		
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputStartEndDate()
	{
		btnStartDate();
		btnBackBulan();
		btnPilihTanggalStart();
		btnEndDate();
		btnPilihTanggalEnd();
		btnFilter();
	}
	
	public void filterPilih(String pilih)
	{
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(status);
		sPilih.selectByValue(pilih);
		
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnStartDate()
	{
		this.startDate.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnNew()
	{
		this.btnNew.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnEndDate()
	{
		this.endDate.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalStart()
	{
		this.pilihTanggalStart.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalEnd()
	{
		this.pilihTanggalEnd.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnStatus()
	{
		this.btnStatus.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnFilter()
	{
		this.filter.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnReset()
	{
		this.reset.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnBackBulan()
	{
		this.pilihBack.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtSuccessFilter() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiFilter);
	}
	
	
	
	public String getTxtStartDate() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, startDate);
	}
	
	public String getTxtEndDate() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, endDate);
	}
	
	
//SHOW PAGE SEPULUH
	
	public void btnShow()
	{
		this.show.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnNext()
	{
		this.next.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPrevious()
	{
		this.previous.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void pilihSepuluh(String sepuluh)
	{
		btnShow();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(show);
		sPilih.selectByValue(sepuluh);
		
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void pilihDuaLima(String duaLima)
	{
		btnShow();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(show);
		sPilih.selectByValue(duaLima);
		
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
//	public void scrollBottom()
//	{
//		Utils.scrollDownToButtom(driver);
//		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
//	}
	
	public String getTxtSepuluh() {
		Utils.scrollDownToButtom(driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowSepuluh);
	}
	
	public String getTxtDuaLima() {
		Utils.scrollDownToButtom(driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowDuaLima);
	}
	
	public String getTxtSepuluhPrevious() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowSepuluh);
	}
	
	public String getTxtDuaLimaPrevious() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowDuaLima);
	}
	
	public String getTxtSebelas() {
		Utils.scrollByVisibleElement(txtValidNextSepuluh, driver);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidNextSepuluh);
	}
	
	public String getTxtDuaEnam() {
		Utils.scrollByVisibleElement(txtValidNextDualima, driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidNextDualima);
	}
	
	

}
