package com.nexsoft.ujian1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SuhuTest {

	Suhu suhu;
	
	@BeforeEach
	public void prep() {
		
		suhu = new Suhu();
		
	}
	
	@DisplayName("Positive test : Hitung temperatur celcius")
	@ParameterizedTest
	@CsvFileSource(resources = "dataTemperatur.csv", delimiter = ',', numLinesToSkip = 1)
	public void testTemperatur(int no, double a, double expected) {
		
		double result = suhu.fahren(a);
		result = (double) Math.round((result*100.0)/100.0);
		expected = (double) Math.round((expected*100.0)/100.0);
		assertEquals(expected, result);
		
	}
	
	@DisplayName("Negative test bukan angka : Hitung temperatur")
	@ParameterizedTest
	@CsvSource(value = {"angka1;angka2",
						"angka1;angka2"},
						delimiter = ';')
	public void testSuhuNegativeBukanAngka(double a, double expected) {
		
		double result = suhu.fahren(a);
		assertEquals(expected, result);
		
	}
	
	@DisplayName("Test Absolut Positif : Hitung temperatur")
	@ParameterizedTest
	@CsvSource(value = {"-2;19",
						"-7;22",
						"-10;23"},
						delimiter = ';')
	public void testTemperaturAbsolutPositif(double a, double expected) {
		
		double result = suhu.fahren(a);
		result = (double) Math.round((result*100.0)/100.0);
		expected = (double) Math.round((expected*100.0)/100.0);
		result = Math.abs(result);
		expected = Math.abs(expected);
		assertEquals(expected, result);
		
	}
	
	@DisplayName("Test tidak dimasukkan angka : Hitung temperatur")
	@ParameterizedTest
    @CsvSource(value = {",-12",
						",-12"},
						delimiter = ';')
    public void testTemperaturTidakAngka(String a) {
        
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
        
        double result = suhu.fahren(arrResult[0]);
        result = (double) Math.round((result*100.0)/100.0);
		double expected = (double) Math.round((arrResult[1]*100.0)/100.0);
		assertEquals(expected, result);
        
    }
}
