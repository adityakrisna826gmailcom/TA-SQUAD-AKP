#created_by : Adit
#created_date : 2/10/2022
#updated_by : -
#updated_date : -

Feature: Form Return Sales Filter

#Show Page 10

   Scenario: Siloam090 Form Return Sales Show Page Sepuluh
		When Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Sepuluh
		And  Siloam090 Sales Tekan Tombol Show Sepuluh
		And  Siloam090 Sales Pilih Sepuluh
    Then Siloam090 Validasi Angka Sepuluh 
    
   Scenario: Siloam090 Form Return Sales Show Page Sepuluh Next
		When Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Sepuluh
		And  Siloam090 Sales Tekan Tombol Show Sepuluh Next
    Then Siloam090 Validasi Angka Sebelas 
    
    Scenario: Siloam090 Form Return Sales Show Page Sepuluh Previous
		When Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Sepuluh Dan Next 
		And  Siloam090 Sales Tekan Tombol Show Sepuluh Previous
    Then Siloam090 Validasi Angka Sepuluh Previous
    
#Show Page 25    

    Scenario: Siloam090 Form Return Sales Show Page Dua Puluh Lima
		When Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Dua Puluh Lima
		And  Siloam090 Sales Tekan Tombol Show Dua Puluh Lima
		And  Siloam090 Sales Pilih Dua Puluh Lima
    Then Siloam090 Validasi Angka Dua Puluh Lima
    
   Scenario: Siloam090 Form Return Sales Show Page Dua Puluh Lima Next
		When Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Dua Puluh Lima
		And  Siloam090 Sales Tekan Tombol Show Dua Puluh Lima Next
    Then Siloam090 Validasi Angka Dua Puluh Enam 
    
    Scenario: Siloam090 Form Return Sales Show Page Dua Puluh Lima Previous
		When Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Dua Puluh Lima Dan Next 
		And  Siloam090 Sales Tekan Tombol Show Dua Puluh Lima Previous
    Then Siloam090 Validasi Angka Dua Puluh Lima Previous