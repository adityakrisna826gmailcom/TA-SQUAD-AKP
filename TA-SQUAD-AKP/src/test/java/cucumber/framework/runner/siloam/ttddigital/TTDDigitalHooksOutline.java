package cucumber.framework.runner.siloam.ttddigital;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.scenariotest.siloam.SiloamTTDDigital;
import cucumber.framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TTDDigitalHooksOutline {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/siloam/extentreport/siloam-sales-TTD Digital-outline.html");
	private static SiloamTTDDigital[] tests = SiloamTTDDigital.values();
	private static final int[] DATA_OUTLINE = {57,6,11,11,6,2,2,2,1,1,1,1,1,1,1};//57,6,10,11,6,2,2,2,1,1,1,1,1,1,1
	private String testReport = "";
//	57,6,10,11,6,2,2,2,1
	
	@Before
	public void setUp() {		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);		
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "Siloam_TandaTanganDigitalOutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}
}
