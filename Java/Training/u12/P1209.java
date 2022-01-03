package com.themisinc.u12;

/** The <code> P1209 </code> class contains javadoc comments. EXAMPLE
 * 
 * @author a591043
 * @since 12/17/2021
 *
 */

public class P1209 {
	
	/**Holds reference to TCOURSE. It is private static.*/
	private static TCourse tc;
	
	/**The <code>main</code> method instantiates the object
	 * for the static final reference. The data is printed.
	 * @param args Commandline arguments in a String[]
	 */
     public static void main(String[] args) {
    	 tc = new TCourse("Java");
    	 System.out.println("course name=" + tc.getName());
		

	}

}
