package com.upskill.java_4;

public class Encapsulation {
	// Encapsulation used to hide the data using setter and getter method 

	

	private String name = "Lucky ";             // Read n Write only
	private int mobileNumber = 12345678;       // Retrieve, and Read only
	private int ssn = 234445646;                // update, write only
	private String userName = "Upskil;";       // Retrieve, and Read only  
	private String password  = "Up123;";       // Update , Write only 
	
	// setter Method - name 
	public void setName (String value){
		name = value;
		
	}
	// Getter Method - name                // get the data , Read
	public String getName(){
		return name ;
		
	}
	 // Getter Method - mobileNumber           // get the data , read
	public int getmobileNumber(){
		return mobileNumber;
	}
	// setter Method -- ssn                      // set the data , Write 
	public void setssn(int value){
		ssn = value;
		
	}
	// Getter Method Username 
	public String userName(){
		return userName;
	}
	// Setter Method - password 
	public void setpassword(String value){
		 password = value;
	}
	
}
