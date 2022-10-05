package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamTTDDigital {

	T1("Siloam120 Sales Update Data Lima Kombinasi"),
	T2("Siloam125 Sales Invalid Edit Data Satu Kombinasi Kosong"),
	T3("Siloam130 Sales Invalid Edit Data Dua Kombinasi Kosong"),
	T4("Siloam135 Sales Invalid Edit Data Tiga Kombinasi Kosong"),
	T5("Siloam140 Sales Invalid Edit Data Empat Kombinasi Kosong"),
	T6("Sales Invalid Edit Data Lima Kombinasi Kosong"),
//	T7("Siloam150 Sales Invalid Edit Data BPJS Kurang Dan NoKTP Kurang"),
//	T8("Siloam210 Sales Menekan Gambar Before Fitur Document"),
//	T9("Siloam210 Sales Menekan Gambar After Fitur Document"),
//	T10("Siloam210 Sales Menekan Gambar TTD Digital Fitur Document"),
//	T11("Siloam215 Sales Menekan Gambar Before Fitur File Upload"),
//	T12("Siloam215 Sales Menekan Gambar After Fitur File Upload"),
//	T13("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload"),
//	T14("Siloam220 Sales Menekan Tombol Submit"),
	;
	
	private String testName;

	private SiloamTTDDigital(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
