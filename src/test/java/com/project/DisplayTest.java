package com.project;	

import java.util.*;
import javax.swing.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DisplayTest{
	
	private Display display;
	private List<Customer> customerList;
	private Customer customer;
	private float f;


//Testing if we get the desired text output

		@Test
	public void testCompileData() {
		f = 0;
		customer = new Customer("Name",f,f,f);
		customerList = new ArrayList<>();
		customerList.add(customer);

		display = new Display(customerList);
		
		assertEquals("Prospect 1: Name wants to borrow 0.0€ for a period of 0.0 years and pay 0.0€ each month.", display.getData()[0]);
	}

	

}