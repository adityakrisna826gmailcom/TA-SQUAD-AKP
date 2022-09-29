package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : -
updated_date : -
*/

public enum SiloamViewExport {

	T1("Siloam020 Admin Memasukkan Start Date End Date Tekan Filter"),
	T2("Siloam025 Admin Tekan Refresh"),
	T3("Siloam030 Admin Tekan Download");
	
	private String testName;
	
	private SiloamViewExport(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
