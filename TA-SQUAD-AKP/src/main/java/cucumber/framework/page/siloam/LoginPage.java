package cucumber.framework.page.siloam;

/*
created_by : Novri
created_date : 29/09/2022
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

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
//	@FindBy(xpath = "//div[@id='page-container']/div/div[2]/div")
	private WebElement msgError; //pesan error
	
	@FindBy(xpath = "//span[@class='d-none d-md-inline']")
	private WebElement lblName; //label name setelah login
	

	public void login(String user, String pass) {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputUsername(user);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputPassword(pass);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputUsername(String user) {
		this.username.sendKeys(user);
	}
	
	public void inputPassword(String pass) {
		this.password.sendKeys(pass);
	}
	
	public void btnLogin() {
		this.login.click();
	}
	
	public String msgInvalid() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgError);
	}
	
	public String getTxtUserInfo() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, lblName);
	}
}
