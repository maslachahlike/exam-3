package com.nexsoft.CSorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.sorting.CSorting;

public class CSortingTest {

	CSorting cSorting;

	@BeforeEach
	public void init() throws IOException {
		cSorting = new CSorting();
	}
	// 1
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testBubbleSort_ProvideData(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {

			// Arrange
			int arrInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			Arrays.sort(expected);

			// Act
			cSorting.bubbleSort(arrInt, arrInt.length);

			// Assert
			assertArrayEquals(expected, arrInt);

		});
	}
	// 2
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testBubbleSort_ArrayNotSorted(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
			
			// Arrange
			int arrInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };

			// Act
			cSorting.bubbleSort(arrInt, arrInt.length);

			// Assert
			assertArrayEquals(expected, arrInt);
		
		});
	}
	// 3
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testSelectionSort_ProvideData(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
		
			// Arrange
			int arrInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			Arrays.sort(expected);

			// Act
			cSorting.selectionSort(arrInt);

			// Assert
			assertArrayEquals(expected, arrInt);
	
		});
	
	}
	// 4
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testSelectionSort_ArrayNotSorted(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
		
			// Arrange
			int arrInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };

			// Act
			cSorting.selectionSort(arrInt);

			// Assert
			assertArrayEquals(expected, arrInt);
	
		});
	
	}
	// 5
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testInsertionSort_ProvideData(int a, int b, int c, int d, int e) {

		assertTimeout(Duration.ofMillis(450), () -> {
			
			// Arrange
			int arrInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			Arrays.sort(expected);

			// Act
			cSorting.insertionSort(arrInt, arrInt.length);

			// Assert
			assertArrayEquals(expected, arrInt);
		
		});
	
	}
	// 6
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testInsertionSort_ArrayNotSorted(int a, int b, int c, int d, int e) {

		assertTimeout(Duration.ofMillis(500), () -> {
			
			// Arrange
			int arrInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };

			// Act
			cSorting.insertionSort(arrInt, arrInt.length);

			// Assert
			assertArrayEquals(expected, arrInt);
		
		});
	
	}

}
