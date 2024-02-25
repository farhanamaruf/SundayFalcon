package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTabels {

	public static void main(String[] args) {
		
		// Array store multiple data using index
		
		int age = 30;                                        //Varaible
		
		int[] ageFalcon = new int []{25, 30, 28, 35, 40};     //Array
		
		//Array index               [0] [1] [2] [3] [3] [4]
		
				 System.out.println("student Age: " + ageFalcon[2]);
				 System.out.println("total Student: " + ageFalcon.length);

				 String[] nameFalcon = new String []{"Tahmid", "Lubna", "Rumi", "Omar" };
				 System.out.println("student Age: " + nameFalcon[2]);
				 System.out.println("total Student: " + nameFalcon.length);
				 
				 boolean[] attendanceFalcon = new boolean []{true, true, false, false, true};
				 System.out.println("student Age: " + attendanceFalcon[2]);
				 System.out.println("total Student: " + attendanceFalcon.length);
				 
				 
				 //multi-dimentional Arrey
				 int[][] ageFalcon2D = {{25, 30, 28, 35, 40},
						                {24, 28, 32, 22,}};
				 System.out.println("Student Age 2D: " + ageFalcon2D[0][3]);
				 
				 //Hashmap store multiple data using key value pair
				
				 HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
				  StudentAge.put("Tahmid", 25);
				  StudentAge.put("Lubna", 28);
				  StudentAge.put("Rumi", 29);
				  StudentAge.put("Omar", 38);
				 System.out.println("Hashmap Student Age: " + StudentAge.get ("Lubna"));
					 
				 HashMap<String, String> Capital = new HashMap<String, String>();
				 Capital.put("bd", "dhaka");
				 Capital.put("New york", "Albany");
				 System.out.println("Hashmap Capital: " + Capital.get ("dhaka"));
				 
				 //HashTable store multi data using key value pair, no duplicate,
				 //also is synchronized ( only 1 thread can be Modified) 
				 
				 Hashtable<String, String> Region = new Hashtable<String, String>();
				 Region.put("bd", "asia");
				 Region.put("usa", "america");
				 System.out.println("Hashmap Region: " + Region.get ("bd"));
				 
				 
				 
				 // Hashset stores unordered collection containing unique value, implementation of set interface
				 
				 HashSet<String> car = new HashSet<>();
				 car.add("BMW");
				 car.add("tasla");
				 car.add("toyta");
				 car.add("audi");
				 System.out.println("car:" + car);
				 
				 }
	}
	
	
	
	   
	   
	    

