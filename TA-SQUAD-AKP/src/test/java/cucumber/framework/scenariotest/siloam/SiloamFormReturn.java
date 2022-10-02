package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamFormReturn {

	T1("Siloam085 Form Return Sales Input Start End Date Tekan Filter Complete");
	
	private String testName;
	
	private SiloamFormReturn(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
