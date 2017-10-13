package Product;

import java.util.*;
public class Console {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt){
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}

}
