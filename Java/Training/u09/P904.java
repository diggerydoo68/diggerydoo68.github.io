package com.themisinc.u09;

public class P904 {

	public static void main(String[] args) {
		boolean[] bArray = {true, false, true}; //primitive array type
		for (int i=0; i < bArray.length; i++){
			System.out.print(i + "=" + bArray[i] + ", ");
		}
		
		String[] sArray = {"CA", null, "TX"}; //Array of class types --> The array does not have the objects to that type. It only has the references to that type, right next to each other. The name is [L thenfullnameofclass(java.lang.String;@8697ce)] the objects are in the heap not right next to each other
		for (int i=0; i < sArray.length; i++){
			if (sArray[i] == null){
				continue;
			}
			System.out.print(i + "=" + sArray[i] + ", ");
		}
		System.out.println("\n" + bArray + "  " + sArray);

	}

}
