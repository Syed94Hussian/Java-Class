//Luis Rizo
/* Author: Syed Hussain
 * Purpose: Learing String
 * Date: 06/21/17
 */

//single class scanner
import java.util.Scanner;

//all the classes with *
import java.util.*;

public class ThirdProject {

	public static void main(String[] args) {
		
	System.out.print("Enter your name: ");

		Scanner name = new Scanner(System.in);
		String name1, name2;
		
		name1 = name.next();
		name2 = name.next();
		
	System.out.print("Enter Price: ");
		
	Scanner sc = new Scanner(System.in);
	String value;
		value = sc.nextLine();
		
	double price = Double.parseDouble(value);

		
	System.out.println(name1 + " " + name2 + " " + price);

	}

}
