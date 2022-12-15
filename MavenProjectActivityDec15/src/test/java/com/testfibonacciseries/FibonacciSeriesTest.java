package com.testfibonacciseries;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

//import org.junit.framework.TestCase;

 class FibonacciSeriesTest {

	static FibonacciSeries fs;
	@BeforeAll
	static void init(){
		 fs = new FibonacciSeries();
	}
	
	@Test
	public void negativeInput(){
		assertEquals(0,fs.fibonacciseries(-2));
	}
	
	@Test
	public void zeroAsInput(){
		assertEquals(0,fs.fibonacciseries(0));
	}

	@Test
	public void oneAsInput(){
		assertEquals(1, fs.fibonacciseries(1));
	}
	
	@Test
	public void getFibResult(){
		assertEquals(6, fs.fibonacciseries(3));
	}
}
