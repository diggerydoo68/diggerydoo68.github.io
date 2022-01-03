package com.themisinc.u00;

public class ObjectCreation {
	int puppyAge;
	
	public Puppy(String name){ //constructor
		//This constructor has one parameter, name
		System.out.println("Name chosen is :" + name); 
		
	}
	
	public void setAge(){ //setters
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}
	
	public int getAge(){ //getters
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		
		/*Object creation*/
		//Puppy myPuppy = new Puppy("tommy");
		
		/*call class method to set puppy's age*/
		//myPuppy.setAge(2);
		
		/*call another class method to get puppy's age*/
		//myPuppy.getAge();
		
		/*You can access instance variables as follows as well
		System.out.println("Varaible Value :" + myPuppy.puppyAge);

	}

}
