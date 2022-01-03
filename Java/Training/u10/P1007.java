package com.themisinc.u10;
class I {
	private int i;
	public I (int i) {
		this.i=i;
	}
	public int getTot (){ //inherited method for subclassess
		return i;
	}
}

class J1 extends I {// Line 18 overrides line 7 via same name, paramsm and return type
	private int j1; //
	public J1 (int i, int j1){
		super(i);
		this.j1=j1;
	}
	public int getTot(){//overriding line 7 because its using i and ji
		return super.getTot() + j1;// if you do not specify the 'super' keyword, then it will go onto to recursion. This is how the child class is able to call the parent and put their own data in
	}
}
//hiding the inherited one, shadowing
class J2 extends I {// Line 29 overloads line 7
	private int j2;
	public J2 (int i, int j2){
		super(i);
		this.j2=j2;
	}
	public int getTot(int arg){//overloading line 7
		return super.getTot() + j2 + arg;// need keyword 'super' to inherit from super class
	}
}
public class P1007 {

	public static void main(String[] args) {
		I objI = new I (1);
		J1 objJ1 = new J1(10, 20);
		J2 objJ2 = new J2 (100, 200);
		
		System.out.println("objI. " + objI.getTot()
		                    + "\nobjJ1. " + objJ1.getTot()
		                    + "\nobjJ1. " + objJ2.getTot()
		                    + "\nobjJ1(5). " + objJ2.getTot(5));

	}

}
