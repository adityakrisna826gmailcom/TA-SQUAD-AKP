package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamTTDDigital {

	T1("Siloam210 Sales Menekan Gambar Before Fitur Document"),
	T2("Siloam210 Sales Menekan Gambar After Fitur Document"),
	T3("Siloam210 Sales Menekan Gambar TTD Digital Fitur Document"),
	T4("Siloam215 Sales Menekan Gambar Before Fitur File Upload"),
	T5("Siloam215 Sales Menekan Gambar After Fitur File Upload"),
	T6("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload"),
//	T7("Siloam220 Sales Menekan Tombol Submit")
	;
	
	private String testName;

	private SiloamTTDDigital(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
