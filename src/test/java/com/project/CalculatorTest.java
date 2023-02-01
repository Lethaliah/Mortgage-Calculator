package com.project;	

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
import java.lang.Math;

public class CalculatorTest{
	
	private Calculator calc;
	private List<Customer> clist;
	private Customer cust;
	private float[] x;
	private float[] y;
	private float[] z;
	private float[] f;


// Testing our pow method

		@Test
	public void powTest() {
		clist = new ArrayList<>();
		cust = new Customer("Name", 0f,1f,2f);
		clist.add(cust);
		calc = new Calculator(clist);
		x= new float[]{2f, 3.14f, 0f, 6f, 0.1f};		//Input
		y= new float[]{1f, 5f, 4f, 0f, 6f};	//Input
		z= new float[5];				//Answers from our pow
		f= new float[5];				//Answers from Math.pow
		
		for(int i=0; i < x.length; i++){
			z[i] = calc.pow(x[i],y[i]);
			f[i] = (float)Math.pow(x[i],y[i]);

			/* The two calculations are compared, to the third decimal 
			(since accuracies on the forth varies, but is acceptable)*/

			assertEquals((int)(f[i]*1000), (int)(z[i]*1000));	
		}
		
		
	}

// Check if calculatePayment gives a non zero result for monthlypayment
		@Test
	public void calculatePaymentTest() {
		clist = new ArrayList<>();
		cust = new Customer("Name", 100f,1f,2f);
		clist.add(cust);
		calc = new Calculator(clist);
		
		assert(calc.calculatePayment(cust) != 0.0);	//(calculatePayment(cust) returns monthlyPayment)	

	}
		
}