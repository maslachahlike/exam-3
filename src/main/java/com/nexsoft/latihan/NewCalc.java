package com.nexsoft.latihan;

import javax.annotation.processing.FilerException;

public class NewCalc {
	
	public int add (int a, int b) {
		return a + b;
	}
	public int substrac(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;	
	}
//	public int divide(int a, int b) {
//		return a / b;
//	}
	
	public int divide(int a, int b) throws Exception {
		
		int nilai = 0;
				
		try {
		nilai = a / b ;
		} catch (ArithmeticException e) {
//			new Throwable("gagal");
			throw new FilerException("gagal");
		}
		return nilai;
	}
	
	public boolean isGanjil(int a) {
		return a % 2 ==1;
		
	}
	
}
