package cucumber.framework.page.siloam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class ViewExportPage {

	private WebDriver driver;
	
	
	public ViewExportPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(id = "datepicker")
	private WebElement startDate;
	
	@FindBy(id = "datepicker2")
	private WebElement endDate;
	
	@FindBy(xpath = "//button[normalize-space()='Filter']")
	private WebElement btnFilter;
	
	@FindBy(xpath = "//span[normalize-space()='View & Export']")
	private WebElement btnViewExport;
	
	@FindBy(xpath = "//button[normalize-space()='Download']")
	private WebElement btnDownload;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")
	private WebElement btnFaskesAwal;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/a[1]")
	private WebElement btnFaskesTujuan;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/a[1]")
	private WebElement btnPDfAgreement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
	private WebElement btnView;
	
	@FindBy(xpath = "//a[@title='Refresh']")
	private WebElement btnRefresh;
	
	@FindBy(xpath = "//button[normalize-space()='Export']")
	private WebElement btnExport;
	
	@FindBy(xpath = "//button[normalize-space()='Export']")
	private WebElement btnPreviewData;
	
	@FindBy(xpath = "//a[@title='View Image After']//img")
	private WebElement btnAfter;
	
	@FindBy(xpath = "//a[@title='View Image Before']//img")
	private WebElement btnBefore;
	
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement btnBack;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtValidasiBack;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElement txtValidasiFilter;
	
	@FindBy(xpath = "//th[normalize-space()='No']")
	private WebElement txtValidasiRefresh;
	
	@FindBy(xpath = "//h4[normalize-space()='An uncaught Exception was encountered']")
	private WebElement txtValidasiDownload;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidDownload;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidExport;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidDownloadEmpty;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidExportEmpty;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtValidasiView;
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li/a/div[3]")
	private WebElement lblName; //label name setelah login
	
	
	public void filter(String user, String pass, String start, String end)
	{
		inputUsername(user);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputPassword(pass);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnLogin();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputStartDate(start);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputEndDate(end);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void inputUsername(String user)
	{
		this.username.sendKeys(user);
	}
	
	public void inputPassword(String pass)
	{
		this.username.sendKeys(pass);
	}
	
	public void inputStartDate(String date)
	{
		this.startDate.sendKeys(date);
	}
	
	public void inputEndDate(String end)
	{
		this.endDate.sendKeys(end);
	}
	
	public void btnLogin()
	{
		this.btnLogin.click();
	}
	
	public void btnFilter()
	{
		this.btnFilter.click();
	}
	
	public void btnDownload()
	{
		this.btnFilter.click();
	}
	
	public void btnPreviewData()
	{
		this.btnPreviewData.click();
	}
	
	public void btnBefore()
	{
		this.btnBefore.click();
	}
	
	public void btnAfter()
	{
		this.btnAfter.click();
	}
	
	public void btnBack()
	{
		this.btnBack.click();
	}
	
	public String getTxtUserInfo() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, lblName);
	}
	
	public String getTxtSuccessFilter() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiFilter);
	}
	
	public String getTxtSuccessDownload() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiDownload);
	}
	
	public String getTxtSuccessRefresh() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiRefresh);
	}
	
	public String getTxtSuccessView() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiView);
	}
	
	public String getTxtSuccessBack() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiBack);
	}
	
	public String getTxtInvalidDownload() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidDownload);
	}
	
	public String getTxtInvalidDownloadEmpty() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidDownloadEmpty);
	}
	
	public String getTxtInvalidExport() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidExport);
	}
	
	public String getTxtInvalidExportEmpty() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidExportEmpty);
	}
	
}
