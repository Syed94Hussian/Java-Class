package ProductIO;

import java.util.Scanner;

public class Console
{
 private static Scanner sc = new Scanner(System.in);
 public static String message;
 
 
 public static String getString(String prompt)
 {
	 System.out.print(prompt);
	 String s = sc.nextLine();
	 return s;
 }
 
 
public static double getDouble(String prompt)
 {
	 double i=0.0;
	 while (true)
	 {
		 System.out.print(prompt);
		 try
		 {
			 i = Double.parseDouble(sc.nextLine());
			 break;
		 }
		 catch (NumberFormatException e)
		 {
			 System.out.println("Error invalid Double. Try again. ");
		 }
	 }
		 return i;
	 }
 
 
}

