package com.themisinc.u12;

/** The <code>main</code> class continue the demo 
 *  of javadoc comments. Only the first sentence goes into
 * @author a591043
 * a method or field Summary. All sentences go in Detail.
 * @version 1.0
 * 
 */

public class TCourse {
	/**Holds training course name. It is static.
	 */
	private static String name = null;
	
	/**Constructor initializes the String. A value must 
	 * be passed because there is only one constructor.
	 * @param name A String to be passed to actor
	 */
	public TCourse (String name){
		if (name == null)name="no name provided";
		this.name = name;// self initilizes to the object "name"
	}
	/**Typical get method. The String name is returned.
	 * @param  none
	 * @return String
	 */
	public String getName(){
		return name;
	}
	

}
