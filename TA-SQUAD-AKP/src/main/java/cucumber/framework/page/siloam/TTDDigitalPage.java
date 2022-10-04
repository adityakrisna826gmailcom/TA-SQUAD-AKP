package cucumber.framework.page.siloam;

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
	
	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/566/566_Before_90295f4f6cad49dae9adfad620f2d7df.png')]")
	private WebElement before;
	
	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/566/566_After_f79f39df06147b8eeb69bb3afa142953.png')]")
	private WebElement after;
	
	@FindBy(xpath = "//img[contains(@src,'https://dev.ptdika.com/siloam/upload/dokumen/566/566_TTD_0e2f59325af64c759eebd459610f8d30.png')]")
	private WebElement ttdDigital;
	
	@FindBy(xpath = "//div[@id='image_preview']/a/img")
	private WebElement beforeFileUpload;
	
	@FindBy(xpath = "//tr[2]/td[3]/div/a/img")
	private WebElement afterFileUpload;
	
	@FindBy(xpath = "//tr[3]/td[3]/div/a/img")
	private WebElement ttdDigitalFileUpload;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@role='alert']") //TTD Digital Berhasil
	private WebElement txtValidSubmit;
	
	
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
}
