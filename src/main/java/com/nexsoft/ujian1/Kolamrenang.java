package com.nexsoft.ujian1;

public class Kolamrenang {


	//1. keliling pp = 2 (p+l)
	//2. volume pp = p*l*t
	public double keliling (int a, double p, double l, double t) {
		a = 4;
		return  ( a * (p + l + t));
	}
	
	public double keliling2 (int a, double p, double l, double t) throws IllegalArgumentException {
		a = 4;
		return  ( a * (p + l + t));
	}
	
	public double volume (double p, double l, double t) {
		return  p * l * t;
	}
	
	public double volume2 (double p, double l, double t) throws IllegalArgumentException {
		return  p * l * t;
	}
	
}

