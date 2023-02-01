package com.project;	

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest{
	
	private Customer c;
	private float f;


// Testing all methods in Customer

// Constructor: Customer(String n, float l, float t, float i)

		@Test
	public void testGetName() {
		f = 0;
		c = new Customer("Name", f, f, f);
		
		assertEquals("Name", c.getName());
	}

		@Test
	public void testGetLoan() {
		f = 0;
		c = new Customer("Name", f, f+1, f+2);
		
		assert(f == c.getLoan());
	}

		@Test
	public void testGetTime() {
		f = 0;
		c = new Customer("Name", f, f+1, f+2);
		
		assert(f+1 == c.getTime());
	}

		@Test
	public void testGetInterest() {
		f = 0;
		c = new Customer("Name", f, f+1, f+2);
		
		assert(f+2 == c.getInterest());
	}

		@Test
	public void testMonthlyPayment() {
		f = 0;
		c = new Customer("Name", f, f+1, f+2);
		c.setMonthlyPayment(f+3);
		assert(f+3 == c.getMonthlyPayment());
	}

}