package com.themisinc.u07;

public class MyString7 {
	private String str;

    public MyString7 (String paramString) { //constructor
        setStr (paramString);
    }
    public MyString7 () {
        this ("default string");
    }   

    public String getStr() {
        return str;
    }
    public void setStr (String str) {
        this.str = str;
    }

}
