package com.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Arrays;
import java.util.*;


public class FileReader{

	private List<Customer> customerList;
	
/* Reads file with customer info and makes a list of customers
*/ 	
	public  FileReader(){
		
		String content = new String();
		Path filePath = Path.of("prospects.txt");

			try {
            			content = Files.readString(filePath);

       			}
       			catch (IOException e) {
         			e.printStackTrace();
        		}

		fileToCustomerList(content);	
		
		
	}



	

/*Cleans and stores fileinfo in a list of customers
*/
	private void fileToCustomerList(String s){

		String s2 = s.replaceAll("(,)([A-Z])", " $2");  		//Making sure names don't have commas 
		s = s2.replaceAll(" ","").replaceAll("\"","");			//Removes all spaces and citations
		
		String[] list = s.split("\n"); 					//Separates individual customers 

		String[] temp = new String[4];	
		String[] formatted = new String[4];
		customerList = new ArrayList<>();

		
		for(int i = 1; i< list.length; i++){						//Start at i=1 to remove column labels
			
			boolean haveLetters = list[i].matches(".*[a-zA-Z]+.*");
												//We only save a row as a customer if there is any name (ie letters) written on it
			if(haveLetters){				
			
				temp = list[i].split(",");					//Separates info where there are commas

				String name =temp[0].replaceAll("(.)([A-Z])", "$1 $2");		//Puts back space between names

				for(int j = 1; j < temp.length ; j++){				//This affects all but names
					String tmp = temp[j].replaceAll("[^0-9,.]","");		//Removes all but numbers and "." 
					formatted[j]= tmp;
				}

			
				float loan = Float.parseFloat(formatted[1]);
				float interest = Float.parseFloat(formatted[2]);
				float time = Float.parseFloat(formatted[3]);

				
				Customer cust = new Customer(name, loan, time, interest/100);	//divides interest by 100, because former was in % format
			        customerList.add(cust);		
			}

		}
		
		
		

	}

/* Method for returning the customer list
*/
	public List<Customer> getList(){
		return customerList;
	}


}


		//List<Customer> customers = new ArrayList<Customer>();