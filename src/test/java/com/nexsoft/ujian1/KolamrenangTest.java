package com.nexsoft.ujian1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class KolamrenangTest {

	Kolamrenang kolam;
	double p, l, t;
	
	@BeforeEach
	public void init() throws IOException {
		kolam = new Kolamrenang();
	}
	//Keliling 1
	@ParameterizedTest
	@DisplayName("Test Keliling Kolam Sukses 1")
	@CsvFileSource(resources = "data_keliling.csv", delimiter = ',', numLinesToSkip = 1)
	public void testKelilingKolam(int a, double p, double l, double t, double expected) {
		
		double result = kolam.keliling(a, p, l, t);
		assertEquals(expected, result);
	}
	
	//Keliling 2
	@ParameterizedTest
	@DisplayName("Test Keliling Kolam, Bukan Angka")
	@CsvSource("String")
	@CsvFileSource(resources = "data_keliling.csv", delimiter = ',', numLinesToSkip = 1)
	public void testKelilingKolam_BukanAngka(String str) {
		assertThrows(IllegalArgumentException.class, ()-> {
			kolam.keliling2(3, 5, Double.parseDouble(str), 7);
		});
	}
	
	//Keliling 3
	@DisplayName("Test Keliling Kolam, Angka Negatif")
	@ParameterizedTest
	@CsvSource(value = {"-2;-3;-4;24",
						"-1;-3;-5;15",
						"-1;-3;-4;12"},
						delimiter = ';')
	public void testKelilingKolam_AngkaNegatif(int a, double p, double l, double t, double expected) {
		
		double result = kolam.keliling(a, p, l, t);
		assertEquals(expected, result);
	}
	
	//Keliling 4
	@DisplayName("Test Keliling Kolam, Kosong")
	@ParameterizedTest
    @CsvSource(value = {",,,0",
						",,,0",
						",,,0"},
						delimiter = ';')
    public void testKelilingKolam_Kosong(String a) {
        
        String arrIsi[] = a.split(",");
        int panjangData = arrIsi.length;
        int arrResult[] = new int[panjangData];
        
       
        for (int i = 0; i < panjangData; i++) {
        	if (arrIsi[i].isEmpty())
        	{
        		arrResult[i] = 0;
        	}
        	else {
        		arrResult[i] = Integer.parseInt(arrIsi[i]);
        	}
        }
        
        double result = kolam.keliling(4 ,arrResult[0], arrResult[1], arrResult[2]);
		assertEquals(arrResult[3], result);
        
    }
	
//___________________________________________________________________________	
	//volume 1
		@ParameterizedTest
		@DisplayName("Test Volume Kolam Sukses 1")
		@CsvFileSource(resources = "data_volume.csv", delimiter = ',', numLinesToSkip = 1)
		public void testVolumeKolam(int a, double p, double l, double t, double expected) {
			
			double result = kolam.volume(a, p, l, t);
			assertEquals(expected, result);
		}
		
		//volume 2
		@ParameterizedTest
		@DisplayName("Test volume Kolam, Bukan Angka")
		@CsvSource("String")
		@CsvFileSource(resources = "data_volume.csv", delimiter = ',', numLinesToSkip = 1)
		public void testVolumeKolam_BukanAngka(String str) {
			assertThrows(IllegalArgumentException.class, ()-> {
				kolam.volume2(p, l, t);
			});
		}
		
		//volume 3
		@DisplayName("Test Volume Kolam, Angka Negatif")
		@ParameterizedTest
		@CsvSource(value = {"-2;-3;-4;24",
							"-1;-3;-5;15",
							"-1;-3;-4;12"},
							delimiter = ';')
		public void testVolumeKolam_AngkaNegatif(int a, double p, double l, double t, double expected) {
			
			double result = kolam.volume(a, p, l, t);
			assertEquals(expected, result);
		}
		
		//volume 4
		@DisplayName("Test volume Kolam, Kosong")
		@ParameterizedTest
	    @CsvSource(value = {",,,0",
							",,,0",
							",,,0"},
							delimiter = ';')
	    public void testVolumeKolam_Kosong(String a) {
	        
	        String arrIsi[] = a.split(",");
	        int panjangData = arrIsi.length;
	        int arrResult[] = new int[panjangData];
	        
	       
	        for (int i = 0; i < panjangData; i++) {
	        	if (arrIsi[i].isEmpty())
	        	{
	        		arrResult[i] = 0;
	        	}
	        	else {
	        		arrResult[i] = Integer.parseInt(arrIsi[i]);
	        	}
	        }
	        
	        double result = kolam.volume(4 ,arrResult[0], arrResult[1], arrResult[2]);
			assertEquals(arrResult[3], result);
	        
	    }
		
	
}

