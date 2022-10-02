#created_by : Adit
#created_date : 2/10/2022
#updated_by : -
#updated_date : -

Feature: Form Return Sales Filter

   Scenario: Siloam085 Form Return Sales Input Start End Date Tekan Filter Complete
		When Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Complete
		And  Siloam085 Sales Input Start Date Complete
		And  Siloam085 Sales Input End Date Complete
		And  Siloam085 Sales Input Status Complete
		And  Siloam085 Sales Tekan Tombol Filter Complete
    Then Siloam085 Validasi data complete tampil pada halaman form return 
    
  