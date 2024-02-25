package com.upskill.java_5;

public interface Interface {

	
	// interface can have only abstract methods, Java 8 and forward they have static method too
	// abstract method doesnt have any implementation
	
	
	
	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iEngine();
	
	
	}

/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)	
					
Class						extends			        class
Abstract Class(+3)   		extends                 class(3-3=0)
Interface(+3)		   	   implements               class(3-3=0)
Interface(+3)			   extends                 Interface(3+3=6)      implements             class(6-6=0)

*/
