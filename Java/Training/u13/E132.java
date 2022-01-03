package com.themisinc.u13;

public class E132{

	public static void main(String[] args) {
		
		String str12 = "12";
		try {
			testForAllDigits(str12);
		}catch (BadDataException bde){
			bde.printStackTrace();
			System.exit(1);
		}
		System.exit (0);

	}
	public static void testForAllDigits(String s)
	throws BadDataException {
			for (int i=0; i<s.length(); i++){
				if (Character.isDigit(s.charAt(i))){
					continue;
				}else{
					throw new BadDataException ("non-digit");
				}
			}
			System.out.println("all digits: "+ s);
		}
	}
