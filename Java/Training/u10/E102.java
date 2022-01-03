package com.themisinc.u10;
import java.text.NumberFormat;
import java.util.Local;

public class E102 {

	public static void main(String[] args) {
		Emplyee e1 = new Emplyee("Witte,Helen",52000);
		Emplyee e2 = new Emplyee("Rafael,Tal",77000);
		OT_Emplyee e3=new OT_Emplyee("Bon,Mafa",48500,61);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		
		
		p(e1.name + "\t" + nf.format(e1.getWeeklySalary()));
		p(e2.name + "\t" + nf.format(e2.getWeeklySalary()));
		p(e3.name + "\t" + nf.format(e3.getWeeklySalary()));

	}
	public static void p (String str){
		System.out.println(str);
	}

}
