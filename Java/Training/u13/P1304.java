package com.themisinc.u13;

public class P1304 {

	public static void main(String[] args) {
		
		try {
			sub (0);
		} catch (AException ae){
			System.out.print("ae=" + ae + ", ");
		} catch (BException be){
			System.out.print("be=" + be + ", ");
		} finally {
			System.out.print("finally, ");
		}
		System.out.println("after try-catch");

	}
	public static void sub (int i)
	throws AException, BException {
		if (i == 0)
			throw new AException ();
		if (i == 1)
			throw new BException();
		return;
	}

}
