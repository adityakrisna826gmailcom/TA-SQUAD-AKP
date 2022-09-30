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
	T3("Siloam030 Admin Tekan Download"),
	T4("Siloam035 Admin Tekan Export"),
	T5("Siloam040 Admin Menekan View"),
	T6("Siloam045 Admin Menekan Back"),
	T7("Siloam050 Admin Menekan Preview Data"),
	T8("Siloam055 Admin Tekan Faskes Awal"),
	T9("Siloam060 Admin Tekan Faskes Tujuan"),
	T10("Siloam065 Admin Tekan PDF Agreement");
	
	private String testName;
	
	private SiloamViewExport(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
