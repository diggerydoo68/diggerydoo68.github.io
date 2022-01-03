package com.themsinc.u15;

class A {
	private int a;
	public A (int a) {
		this.a=a;
	}
	public String toString(){
         return "A:a=" + a;

	}
}
class B extends A {
	private int b;
	public B (int a, int b){
		super(a);
		this.b=b;
	}
	public String toString(){
		return "B:b=" + b + "[" + super.toString() + "]";
	}
}
class C extends B {
	private int c;
	public C (int a, int b, int c){
		super(a, b);
		this.c=c;
	}
	public String toString(){
		return "C:c=" + c + "[" + super.toString() + "]";
	}
}
class D {
	private int d;
	public D (int d){
		this.d=d;
	}
}
public class P1505 {
	public static void main(String[] args) {
		A a = new A (1);
		B b = new B (10, 20);
		C c = new C (100, 200, 300);
		D d = new D (99);
		System.out.println (a +"\n"+b+"\n"+c+"\n"+d);

	}

}
