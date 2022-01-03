package com.themisinc.u00;

public class ObjTest {

	//example generation of getters and setters
	// first create a variable outside of the main method "String tc2;"
	String tc2; // instance variables. Not declared inside a specific a method. Not static. properties, attributes.
	String tc3;
	
	public ObjTest(String mularkey, String tc3) { // constructor, which is 
		setTc2(mularkey); // set to instance variable datatype so that it can be accessed by class ObjAccess. It does not have to be the same name as the instance variable(String tc2;)
		setTc3(tc3); // setter method for stc3 string 
	}
	// then click on source --> generate getters and setters
	// checkbox your variable that you created "tc2" and press ok
	// this creates both getters and setters and the "this" keyword
	public String getTc2() {
		return tc2;
	}
	public void setTc2(String tc2) {
		this.tc2 = tc2; // notes the variable of the object. self reference. Points to itself so that the compiler can validate the object reference in the heap
	}
	
	public String getTc3() {
		return tc3;
	}
	public void setTc3(String tc3) {
		this.tc3 = tc3; // notes the variable of the object. self reference. Points to itself so that the compiler can validate the object reference in the heap
	}
	
	// for object creation, the main method is not needed.
	//public static void main(String[] args) { 
		// TODO Auto-generated method stub
		

	//}

}
