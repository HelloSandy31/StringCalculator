package com.example;

public class StringCalculators {

	public int add(String numbers) {

		String[] numbersArray = numbers.split(",");
		int sum = 0;

		if (numbers.isEmpty()) {
			return 0;
		}

		if (numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}

		// Adding to numbers only
		if (numbers.length() == 2) {
			return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);
		}

		// Handle Unknown amount Of numbers
		else {
			for (String current : numbersArray) {
				sum += Integer.parseInt(current);

			}

			return sum;

		}

	}
}
