package com.project;

public class Customer{

	private String name; 
	private float loan;
	private float time;
	private float interest;
	private float monthlyPayment;

//Constructor
	public Customer(String n, float l, float t, float i){
		name =n;
		loan =l;
		time =t;
		interest =i;	
	}


//All Customer methods

//Lets us add information

	public void setMonthlyPayment(float m){
		monthlyPayment = m;
	}

//Lets us retrieve the information 

	public String getName(){
		return name;
	}

	public float getLoan(){
		return loan;
	}

	public float getTime(){
		return time;
	}

	public float getInterest(){
		return interest;
	}

	public float getMonthlyPayment(){
		return monthlyPayment;
	}

}