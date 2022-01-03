package com.themisinc.u09;
import java.text.NumberFormat;
import java.util.Locale;

public class P914 {

	public static void main(String[] args) {
		NumberFormat USA = NumberFormat.getCurrencyInstance(Locale.US);
		
		String n = USA.format(1234567.89);
		System.out.println(":" + n + ":\n");
		
		int spacesNeeded = 16 - n.length();
		StringBuilder sb = new StringBuilder ();
		for (int i=1; i<=spacesNeeded; i++){
			sb.append(' ');
		}
		sb.append(n);
		
		System.out.println(":123456789-123456:ruler line");
		System.out.println(":" + sb + ":");

	}

}
