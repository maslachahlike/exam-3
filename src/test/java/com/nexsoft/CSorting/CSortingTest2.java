package com.nexsoft.CSorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.sorting.CSorting;

public class CSortingTest2 {


	CSorting cSorting;

	@BeforeEach
	public void init() {
		cSorting = new CSorting();
	}

	@ParameterizedTest
	@DisplayName("Test Bubble Sort Split")
	@CsvFileSource(resources = "/data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testBubbleSort(String angka) {

		String angkaS[] = angka.split(",");
		int panjang = angkaS.length;
		int angkaResult[] = new int[angkaS.length];
		int angkaExpected[] = new int[angkaS.length];
		for (int i = 0; i < panjang; i++) {
			angkaExpected[i] = Integer.parseInt(angkaS[i]);
			angkaResult[i] = Integer.parseInt(angkaS[i]);
		}
		cSorting.bubbleSort(angkaResult, angkaS.length);
		Arrays.sort(angkaExpected);
		assertArrayEquals(angkaExpected, angkaResult);

	}
}
//		@ParameterizedTest
//		@DisplayName("Test Bubble Sort")
//		@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
//		public void testBubbleSort(int a, int b, int c, int d) {
//
//			assertTimeout(Duration.ofMillis(500), () -> {
//				int angka[] = { a, b, c, d };
//				int expected[] = { a, b, c, d };
//				cSorting.bubbleSort(angka, angka.length);
//				Arrays.sort(expected);
//				assertArrayEquals(expected, angka);
//			});
//		}
//
//		@ParameterizedTest
//		@DisplayName("Test Selection Sort")
//		@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
//		public void testSelectionSort(int a, int b, int c, int d) {
//
//			assertTimeout(Duration.ofMillis(500), () -> {
//				int angka[] = { a, b, c, d };
//				int expected[] = { a, b, c, d };
//				cSorting.selectionSort(angka);
//				Arrays.sort(expected);
//				assertArrayEquals(expected, angka);
//			});
//		}
//
//		@ParameterizedTest
//		@DisplayName("Test Insertion Sort")
//		@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
//		public void testInsertionSort(int a, int b, int c, int d) {
//
//			assertTimeout(Duration.ofMillis(500), () -> {
//				int angka[] = { a, b, c, d };
//				int expected[] = { a, b, c, d };
//				cSorting.insertionSort(angka, angka.length);
//				Arrays.sort(expected);
//				assertArrayEquals(expected, angka);
//			});
//		}
//
//		@ParameterizedTest
//		@DisplayName("Test Negative Sort")
//		@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
//		public void testNegativeBubbleSort(int a, int b, int c, int d) {
//
//			assertTimeout(Duration.ofMillis(500), () -> {
//				int angka[] = { a, b, c, d };
//				int expected[] = { a, b, c, d };
//				Arrays.sort(expected);
//				assertFalse(Arrays.equals(expected, angka), "Method sort not sorted");
//			});
//		}
//
//		@ParameterizedTest
//		@DisplayName("Test Negative Sort 2")
//		@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
//		public void testNegative2(int a, int b, int c, int d) {
//			assertTimeout(Duration.ofMillis(500), () -> {
//				try {
//					int e = 0;
//					int angka[] = {a, b, c, d, e};
//					int expected[] = {a, b, c, d, e};
//					cSorting.insertionSort(angka, angka.length);
//					Arrays.sort(expected);
//					assertArrayEquals(expected, angka);
//				} catch (ArrayIndexOutOfBoundsException p) {
//					System.out.println("The index you have entered is invalid");
//					System.out.println("Please enter an index number between 0 and 6");
//				}
//
//			});
//		}
//
//	}
//}
