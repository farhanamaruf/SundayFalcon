package com.upskill.java_6;

public class MultiThreadingRunable implements Runnable {

	
	public void run() {
		try{
		System.out.println("Threat Number #" + Thread.currentThread().getId());
		} catch (Exception e){
			e.printStackTrace();
			
		}
		
	}

}
