package com.upskill.java_6;

public class MultiThreading {

	/* multithreading is a java feature that allows concurrent execution of two or more parts of a program.  */
	
	public static void main (String[] args){
		int n = 4;
		for (int i=0; i< n ; i++){
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
		}
	}
} 
