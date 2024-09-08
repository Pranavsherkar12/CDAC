/*
 c. Declare a method-local variable strStatus of type String with the value "true" and convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).
 */

package one;

public class ProgramC {
	public static void main(String args[]) {
		String strStatus = "true";
		
		boolean b = Boolean.parseBoolean(strStatus);
		
		System.out.println(b);
	}
}
