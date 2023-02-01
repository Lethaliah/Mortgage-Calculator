package com.project;

import java.util.*;
import javax.swing.*;  

public class Display{
	

	private static List<Customer> customerList;	
	private static String[] data;

/*	Displays our results to the user
*/

	public Display(List<Customer> list){
		
		customerList = list;

		compileData();

		JOptionPane.showMessageDialog(null, new JList(data)); 
		

	}

/* Compiles our customers data in strings we want to print
*/
	private void compileData(){
		
		data = new String[customerList.size()];		

		for(int i=0; i<customerList.size(); i++){

			Customer cust = customerList.get(i);
			String name = cust.getName();
			String loan = Float.toString(cust.getLoan());
			String time = Float.toString(cust.getTime());
			String mont = Float.toString(cust.getMonthlyPayment());

			data[i] = "Prospect "+(i+1)+": "+name+" wants to borrow "+loan+"€ for a period of "
				+time+" years and pay "+mont+"€ each month.";
		}	
	}
	
//Allowing retrieval of data

	public String[] getData(){
		return data;
	}
	



}