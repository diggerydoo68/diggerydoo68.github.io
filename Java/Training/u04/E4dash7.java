package com.themisinc.u04;

public class E4dash7 {

	public static void main(String[] args) {
		
		boolean b1 = displayStartDay ("Monday");
		boolean b2 = displayStartDay (2);
		boolean b3 = displayStartDay ();
		System.out.println("1="+b1+", =2"+b2+", =3"+b3);

	}
	public static boolean displayStartDay (String s) {
		if (s==null){
			return false;
		}
		System.out.println("Class starts on " + s);
		return true;
	}
	public static boolean displayStartDay (int day){
		String s;
		switch (day){
		case 1: s="Monday"; break;
		case 2: s="Tuesday"; break;
		case 3: s="Wednesday"; break;
		case 4: s="Thursday"; break;
		case 5: s="Friday"; break;
		default: return false;
		}
		boolean tmp = displayStartDay (s);
		return tmp;
		// same as: return displayStartDay
	}
	public static boolean displayStartDay(){
		return false;
	}

}
