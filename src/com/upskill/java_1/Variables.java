package com.upskill.java_1;

public class Variables {

	
 String country = "USA"; // global variable - Variable decleared in class level , outside method
static String Region ="America"; // static variable - variable belong to class and don't req creating object
		
public static void main(String[]args) {

			String city = "New York"; //Local Variable - Variable declared in methods
			System.out.println(city);
			
			
			
			Variables object = new Variables(); //ClassName ObjectName = new ClassName();
			System.out.println(object.country);
			
			System.out.println(Region);
			
		}
		
		public void NJ(){
			String city = "paterson";
			System.out.println(city);  //Local Variable - Variable declared in methods
		}
		
		public void CT(String county ){ //Method parameter - variable used as method parameter
			String city = "Heartfort";
			System.out.println(city);
			
			String myCounty = county;
			
		}
		
}