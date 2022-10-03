package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamFormReturn {

//	T1("Siloam085 Form Return Sales Input Start End Date Tekan Filter Complete"),
//	T2("Siloam085 Form Return Sales Tekan Reset Complete"),
//	T3("Siloam085 Form Return Sales Input Start End Date Tekan Filter Pending"),
//	T4("Siloam085 Form Return Sales Tekan Reset Pending"),
//	T5("Siloam085 Form Return Sales Input Start End Date Tekan Filter Pilih"),
//	T6("Siloam085 Form Return Sales Tekan Reset Pilih"),
//	T7("Siloam090 Form Return Sales Show Page Sepuluh"),
//	T8("Siloam090 Form Return Sales Show Page Sepuluh Next"),
//	T9("Siloam090 Form Return Sales Show Page Sepuluh Previous"),
//	T10("Siloam090 Form Return Sales Show Page Dua Puluh Lima"),
//	T11("Siloam090 Form Return Sales Show Page Dua Puluh Lima Next"),
//	T12("Siloam090 Form Return Sales Show Page Dua Puluh Lima Previous"),
//	T13("Siloam090 Form Return Sales Show Page Lima Puluh"),
//	T14("Siloam090 Form Return Sales Show Page Lima Puluh Next"),
//	T15("Siloam090 Form Return Sales Show Page Lima Puluh Previous"),
	T16("Siloam090 Form Return Sales Show Page Seratus"),
	T17("Siloam090 Form Return Sales Show Page Seratus Next"),
	T18("Siloam090 Form Return Sales Show Page Seratus Previous");
	
	private String testName;
	
	private SiloamFormReturn(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
