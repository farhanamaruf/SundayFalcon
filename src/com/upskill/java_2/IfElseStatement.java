package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 109;
		
		if (age < 13){
			System.out.println("you are children");
		} else if (age <18) {
			System.out.println("you are Teenager");
		} else if (age <=60) {
			
			System.out.println("you are adult");
		} else {
			System.out.println("you are Senior Citizen");
		 
		}
	}

}
