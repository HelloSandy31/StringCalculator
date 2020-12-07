package com.example;

public class StringCalculators {

	public int add(String numbers) {

		String[] numbersArray = numbers.split(",");

		if (numbers.isEmpty()) {
			return 0;
		}

		if (numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}

		else {
			return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);
		}
	}
}
