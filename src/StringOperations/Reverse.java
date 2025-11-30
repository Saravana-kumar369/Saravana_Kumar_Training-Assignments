
package StringOperations;

import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scan.nextLine();
		String revStr = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			revStr +=  str.charAt(i);
		}
		System.out.println("Reversed String: " + revStr);
		
	}

}
