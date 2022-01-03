package com.themisinc.u09;

public class E910 {

	public static void main(String[] args) {
		
		String[] arr1={"Maine", null, "Ohio", "Alaska"};
		
		for (String state : arr1){
			if (state == null){
				continue;
			}
			System.out.print(state + " ");
		}
		
		String[] arr2 = new String[4];
		arr2[0] = new String("NY");
		arr2[1] = new String("NJ");
		
		for (String abbreviation : arr2){
			System.out.println(abbreviation + " ");
		}
		System.out.println();

	}

}
