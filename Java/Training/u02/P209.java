package com.themisinc.u02;

public class P209 {

	public static void main(String[] args) {
		double result = 1.0 + 2.0 * 3.0 - 4.0/5.0;
		
		float subtotal = 1.50F; //cast operator required
		double salesTax = 0.0825;
		double total = subtotal + (subtotal * salesTax);
		
		System.out.println("r=" + result + ", t=" + total);

	}

}
