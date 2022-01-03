package com.themisinc.u13;

public class P1303 {

	public static void main(String[]a) throws MyException {
		System.out.println("1. main");
		
		try{
			throwMethod ('a');
		}catch (MyException e){
			System.out.println("3. catch, e=" + e);
		}
			
			
			System.out.println("4. main");
			throwMethod('c');
			throwMethod('b');
		}
		
		static void throwMethod (char ch) throws MyException {
			System.out.println("2. method called with " + ch);
			
			if (ch == 'a')
				throw new MyException ("a helpful message");
			if (ch == 'b')
				throw new MyException ();
		}

	}

