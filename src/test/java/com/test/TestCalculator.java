package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.StringCalculators;

public class TestCalculator {
	public StringCalculators sc = new StringCalculators();

	//Negative Not allowed testing with exception
	@Test(expected=Exception.class)
	public void negativeInputReturnsException() throws Exception
	{
		sc.add("-10");
	}
	
}
