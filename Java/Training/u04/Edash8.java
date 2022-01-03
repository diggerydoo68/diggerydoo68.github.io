package com.themisinc.u04;

public class E4dash8 {
	//static variables are used to hold constants so that changes to code are limited to one line
	public static final double TAX_RATE = .06; //constant. Final means that you can only assign value one time. Would need to change source code and compile again to change
	public static final String STORE = "BuyHere"; //constant
	public static double totalSaleAndTax = 0; //accumulator
	public static int saleNumber = 0; //number generator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sale1 = 12.00;
		double sale2 = 56.00;
		calcTax(sale1);
		calcTax(sale2);
	}
	public static void calcTax(double sale){
		double taxAmount = sale * TAX_RATE;
		double saleAndTax = sale + taxAmount;
		totalSaleAndTax += saleAndTax; //add to daily total
		printReciept(sale, taxAmount, saleAndTax);
		
	} 
	private static void printReciept(double sale, double taxAmount, double saleAndTax) {
		saleNumber += 1;
		System.out.println("Sale Number: " + saleNumber + "\nItems\t" + sale + "\nTax\t" + taxAmount + "\nTotal\t" + saleAndTax + "\n---" + STORE + "---\n");
	}

}
