package cucumber.framework.scenariotest.siloam;

public enum SiloamViewExportInvalid {

	T1("Siloam070 Admin Melihat Data Karyawan Invalid Empty");
	
	private String testName;
	
	private SiloamViewExportInvalid(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
