package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamFormReturn {

	T1("Siloam085 Form Return Sales Input Start End Date Tekan Filter Complete"),
	T2("Siloam085 Form Return Sales Tekan Reset Complete"),
	T3("Siloam085 Form Return Sales Input Start End Date Tekan Filter Pending"),
	T4("Siloam085 Form Return Sales Tekan Reset Pending"),
	T5("Siloam085 Form Return Sales Input Start End Date Tekan Filter Pilih"),
	T6("Siloam085 Form Return Sales Tekan Reset Pilih");
	
	private String testName;
	
	private SiloamFormReturn(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
