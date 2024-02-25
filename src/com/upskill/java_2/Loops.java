package com.upskill.java_2;

public class Loops {
	/*
	 Types of Loop
	 1.For loop
	 2.While Loop
	 3.Do While Loop
	 4.Infinite Loop
	 */

	public static void main(String[] args) {
//		 practiceForLoop();
//		 practiceWhileLoop();
//		 practiceDoWhileLoop();
//		 practiceInfiniteLoop();
		 practiceNestedForLoop();
	}
public static void  practiceForLoop(){ //for loop - do again n again upto upper limit
	int i;                             // Initialize the Varaible  
	for (i = 1; i <= 10; i++){        // Setting the limit, lower / upper / increment or decrement
		System.out.println(i);         //Statement 
		
	}
}
//while Loop - do again and again upto condition Match 
public static void  practiceWhileLoop(){
	int i = 1;                                               // initialize the Variable
	while (i<=10){                                           // setting the condition
		System.out.println("While Loops number =" + i);      // statement 
		i++;                                                  //Increment or decrement 
	}
}
// Do While Loop
public static void  practiceDoWhileLoop(){     //Do While Loop - Do Action then match condition
	int i = 1;                                  // Initialize the Variable
	do {
		System.out.println("Do While Loops number = " + i );    //statement 
		i++;                                                    // Increment or decrement
	} while(i<=10);                                             // Checking the Condition
}
// Infinate Loop
public static void  practiceInfiniteLoop(){              //Infinite Loop - never ending loop
	int i;                                                 // initialize the variable 
	for (i = 1; ; i++){                                  //setting No upper limit
		System.out.println("For Loops number = " + i);   // Statement 
		
	}
}
//Nested Loop
public static void  practiceNestedForLoop(){
	int i;
	int j;
	for (i = 1; i <=10; i++){     
		for (j = 1; j <=10; j++){    
			int multipicationTable = i * j;
			System.out.print(multipicationTable + " ");
		}
		System.out.println(" ");
}
}

}