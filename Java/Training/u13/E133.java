package com.themisinc.u13;

public class E133 {

	public static void main(String[] args) {
		String str12 = "1x2x3";
		try {
			testForAllDigits(str12);
		}catch (BadDataException bde){
			bde.printStackTrace();
			System.exit(1);
		}
		System.exit(0);

	}
	public static void testForAllDigits(String s)
	throws BadDataException{
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s.length(); i++){
			if (Character.isDigit(s.charAt(i))){
				continue;
			}else{
				sb.append("\nnon-digit at index " + i);
			}
		}
		if (sb.length() == 0){
			System.out.println("all digits: "+ s);
		}else{
			throw new BadDataException (sb.toString());
		}
	}

}
