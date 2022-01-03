package com.themisinc.u10;

public class MySub extends MySuper {
	private int second;    //one coded int
	                       // one inherited int

	public MySub(int first, int second) { //how to create a subclass
       super (first);
       this.second=second; // this is the reason for using inheritance. making public MySuper (int first) overloaded 
	}
	public MySub(int i) {
		this (i, i+1); // the use of this with the open in a constructor "(" is a call to thepublic MySub(int first, int second)
	       
	}
	public int getSecond(){
		return second;
	}

}
