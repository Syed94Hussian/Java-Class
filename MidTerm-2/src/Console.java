

import java.util.*;
public class Console {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt){
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}
	public static int getInt(String prompt){
		int i = 0;
		while (true){
			System.out.print(prompt);
			
			try{
				i = Integer.parseInt(sc.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Error invalid integer. Try again!");
			}
		}
		return i;
		
	}
	
}
