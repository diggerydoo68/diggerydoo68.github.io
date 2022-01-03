package com.themisinc.u00;

public class ObjAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example of access object from ObjTest class
		
		//ObjTest obj2; // reference that is not pointing
		
		 ObjTest obj = new ObjTest ("howdy", "doody"); // creating a reference by using the constructor, it is pointing
		 ObjTest obj2 = obj; // pointing a new reference to the first reference obj
		 ObjTest obj3 = new ObjTest ("wazup", "doc");
		 // constructors are like methods. must be the exact name of the class. Cannot have return type. Can only be called by the new object.
		 // The constructor initializes the instance variable of the object. Sometimes parameters are received. Common practice is that each class contains a constructor with no parameters.
		 // Instance variable
		 // Constructor are used to initialize data
		 
		 //ObjTest obj2 = new ObjTest ("Doody"); 
		 
		 System.out.println(obj); // access object reference
		 System.out.println(obj.getTc2());// prints the value referencing from the constructor
		 System.out.println(obj2.getTc3());// prints second value "doody"
		 System.out.println(obj3.getTc3());// prints obj3 values

	}

}
