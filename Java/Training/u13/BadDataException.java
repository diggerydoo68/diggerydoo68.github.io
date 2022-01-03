package com.themisinc.u13;

public class BadDataException extends Exception {
	private static final long serialVersionUID = 1L;
	public BadDataException (){
		
	}
	public BadDataException (String s){
		super(s);
	}

}
