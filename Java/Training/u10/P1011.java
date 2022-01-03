package com.themisinc.u10;

public class P1011 {

	public static void main(String[] args) {
		ComputerCourse cc = new ComputerCourse ("Java"); //object
		SalesCourse sc = new SalesCourse("New Clients");//object
		System.out.println(cc.getNameString());
		System.out.println(sc.getNameString());

	}

}
//abstract is a class with this keyword that might or might not have abstract methods. For this code it has 2.
abstract class TCourse10 {//not public
	public TCourse10 (){//constructor
	}
		public abstract String getNameString ();//does not have a body, like a declarative statement. Any subclass must override any abstract method that it inherits. need to ensure that you have the keyword "abstract"
		public abstract void setNameString (String name);//does not have a body. In other words these can be viewed as required. need to ensure that you have the keyword "abstract" 
}
class ComputerCourse extends TCourse10 { //subclass that inherits two abstract classes above. //not public, includes methods that are overriding the abstract methods
	private String name;//instance variable
	public ComputerCourse (String name){//string name "Java" and "New Clients" is recieved
		setNameString (name);
	}
	public String getNameString(){
		return "Computer Course is \"" + name + "\"";
	}
	public void setNameString (String name){//overiding the abstract class method line 19
		if(name.equals("Java") || name.equals("UNIX"))//remember that the .equals is a method from the "String" object in Java.
			this.name = name;//call to instance variable of "private String name;" line 22 
	}
}
class SalesCourse extends TCourse10 {//not public, includes methods that are overriding the abstract methods 
		private String name;
		public SalesCourse (String name){
			setNameString(name);
		}
		public String getNameString(){
			return "Sales Course is \"" + name + "\"";
		}
		public void setNameString (String name){ //overiding the abstract class method line 19
			if (name.equals("New Clients")||name.equals("Referrals")){
				this.name=name;
		}
	}
}
