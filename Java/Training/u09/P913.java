package com.themisinc.u09;
import java.text.NumberFormat;
import java.util.Locale;

public class P913 {

	public static void main(String[] args) {
		double[] d = { //primitive datatype 8 bytes
				.12340,
				1.12341,
			   12.12342,
			   123.12343,
			   1234.12344,
			   12345.12345,
			   123456.12346,
			   1234567.12347
		};
		
		NumberFormat USA = NumberFormat.getCurrencyInstance(Locale.US); //no public constructor for this class
		for (int i=0; i<8; i++){ //might be preferred (int i=0; i<d.length; i++)
			System.out.println(i + ". " + USA.format(d[i]));
		}
		USA.setMinimumIntegerDigits(0);
		System.out.println("\nA. " + USA.format(d[0])); // prints without the zero dollar format
		
		NumberFormat frac = NumberFormat.getInstance(); // format that sets the precision to 3 decimal places
		System.out.println("B. " + frac.format(d[5]));
		
		frac.setMaximumFractionDigits(4);
		frac.setMinimumFractionDigits(4);
		System.out.println("B. " + frac.format(d[6])); // format that sets the precision to 4 decimal places
		
		
		frac.setGroupingUsed(false);
		System.out.println("B. " + frac.format(d[7]));// format without comma that sets the precision to 4 decimal places

	}

}
