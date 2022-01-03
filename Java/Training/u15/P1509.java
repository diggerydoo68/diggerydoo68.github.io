package com.themsinc.u15;
import java.util.Date;
import java.util.Locale;
import java.util.text.DateFormat;
import java.text.ParseException;

public class P1509 {

	public static void main(String[] args) {
		
		Date d = new Date ();
		Locale.setDefault(Locale.US);
		
		DateFormat dfS = DateFormat.getDateInstance (DateFormat.SHORT);
		
		System.out.println("1. short: " + dfS);
		System.out.println("2. short: " + dfS.format (d));
		
		DateFormat dfM = DateFormat.getDateInstance (DateFormat.MEDIUM);
		System.out.println("3. medium: " + dfM.format(d));
		
		DateFormat dfL = DateFormat.getDateInstance (DateFormat.LONG);
		System.out.println("4. long: " + dfL.format(d));
		
		DateFormat dfF = DateFormat.getDateInstance (DateFormat.FULL);
		System.out.println("5. full: " + dfF.format(d));
		
		DateFormat dfD = DateFormat.getDateInstance (DateFormat.DEFAULT);
		System.out.println("6. default: " + dfD.format(d));
		
		DateFormat t = DateFormat.getDateInstance ();
		System.out.println("7. time: " + t.format(d));
		
		String stringDate = "8/12/10";
		try{
			Date S = dfS.parse ();
			System.out.println("8. " + S);
		}catch (ParseException pe){
			System.out.println("pe=" + pe);
		}

	}

}
