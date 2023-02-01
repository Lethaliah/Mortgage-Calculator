package com.project;	

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class FileReaderTest{
	
	private FileReader reader;
	private List<Customer> customerList;
	private Customer customer;
	private float f;


//Testing if fileToCustomerList adds customers to list successfully


		@Test
	public void testFilReader(){
		reader = new FileReader();
		
		assertFalse(reader.getList().size() == 0 );

	}



		
}