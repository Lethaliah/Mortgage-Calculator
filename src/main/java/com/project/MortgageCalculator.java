package com.project;

import java.util.*;
import java.io.IOException;

public class MortgageCalculator {

	private static FileReader reader;
	private static List<Customer> customerList;
	private static Display display;
	private static Calculator calc;



	public static void main(String[] args){
		
		

		
            	reader = new FileReader();			//Read file, add info list
		customerList = reader.getList();		//Get list of customers

		calc = new Calculator(customerList);		//Calculates and stores monthly payments

		display = new Display(customerList);		//Displays results
		

		System.exit(0);
	}
}




