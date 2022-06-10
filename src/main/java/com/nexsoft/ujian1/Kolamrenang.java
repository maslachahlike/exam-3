package com.nexsoft.ujian1;

public class Kolamrenang {



	public double keliling (int a, double p, double l, double t) {
		a = 4;
		return  Math.abs( a * (p + l + t));
	}
	
	public double keliling2 (int a, double p, double l, double t) throws IllegalArgumentException {
		a = 4;
		return  Math.abs( a * (p + l + t));
	}
	
	public double volume (double p, double l, double t) {
		return  Math.abs( p * l * t);
	}
	
	public double volume2 (double p, double l, double t) throws IllegalArgumentException {
		return  Math.abs( p * l * t);
	}
	
}

