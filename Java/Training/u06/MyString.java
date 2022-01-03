package com.themisinc.u06;

public class MyString {
	private String str;
	
	public MyString (String str){//constructor
		setStr (str);//initializing to the parameter value
	}
	
	public String getStr(){ //gettters
		return str;
	}
	public void setStr(String str){//setters
		this.str = str;
	}

}
