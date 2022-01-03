package com.themisinc.u10;

abstract class Pet {
	private String name;//instance variable
	public pet (String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public abstract String getFavorite();// abstract methods do not use brackets. it must also be overwritten
		
}

class Cat extends Pet {
	private String favoritePerch; //instance variable
	public Cat (String n, String f){
		super(n);
		favoritePerch = f;
	}
	public String getFavorite(){//overrides line 11, abstract method
		return favoritePerch;
	}
}

class Dog extends Pet {
	private String favoritePlayArea;
	public Dog (String n, String f){
		super(n);
		favoritePlayArea = f;
	}
	public String getFavorite(){//overrides line 11, abstract method
		return favoritePlayArea;
	}
}
public class P1107 {
	public static void main(String[] args) {
		Pet[] a = new Pet[2]; //parent refs in array
		
		a[0] = new Cat("Gert", "windowsill");//child obj
		a[1] = new Dog ("Woofie", "Union Square Dogrun");
		
		for (int i = 0; i<a.length; i++){
			System.out.println(a[i].getName() + " likes the " + a[i].getFavorite());
		}
		

	}

}
