package com.project;

import java.util.*;

public class Calculator{
	
	private List<Customer> customerList;
	private Customer customer;
	private float loan;
	private float interest;
	private float time;
	private float monthlyPayment;
	private float temp;
	private float p;


	
//calculates montlhy payments for all customers

	public Calculator(List<Customer> cList){
		customerList = cList;			
		for(int i=0; i < customerList.size(); i++){	
				
			monthlyPayment = calculatePayment(customerList.get(i));
			customerList.get(i).setMonthlyPayment(monthlyPayment);

		}
	}

/* Formula used: 
	X*Y*[(1+Y)^Z]/[(1+Y)^Z-1] = E 
	X = loan amount
	Y = monthly interest rate
	Z = time period (months)
	E = monthly payments
*/

	public float calculatePayment(Customer customer){
		
		loan = customer.getLoan(); 
		interest = customer.getInterest()/12;	//Divide by 12 for monthly interest rate
		time = customer.getTime()*12;		//*12 to convert from years to months
	
		p   = pow( (1+interest) , time ); 
		temp  = p / (p-1);
		monthlyPayment = loan * interest * temp;

		return monthlyPayment;
	}

/* Since usage of java.math or similar math dependencies are not allowed, I write my own method for exponentiation
   Our input means we want to calculate x^y
*/
	public float pow(float x, float y){
		
		float a = x; 
		float b = y;
		float result = a;
	
/*		We don't need a case for numbers below 0 in this program it's not allowed 
		("-" is removed before calculations)
		We also don't need to think about any y values that are not whole
*/
		
		if(y==0) return 1;  	
		else{

			while(b>1){
				result=a*result;
				b--;	
			}

			return result;	
		}
	}



}