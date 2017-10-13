/*Author: Syed Hussain
 * Purpose: Create a new application that calculates the area and the perimeter of a rectangle.
 * Date: 06/22/17
 * */
import java.util.*;
public class AreaPerimeter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculater");
		System.out.println();
		
		
		Scanner sc = new Scanner (System.in);
		
		String choice;
		choice = "y";
		while(choice.equalsIgnoreCase("y")){
			
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter weidth: ");
		double weidth = sc.nextDouble();
	
		double area = length * weidth;
		double perimeter = 2 * (length + weidth);
		
		String message = 
				"Area: " + area + "\n" +
				"Perimeter: " + perimeter + "\n";
		System.out.println(message);
		
		System.out.print("Continue (y/n): ");
	    choice = sc.next();
	    System.out.println();
			
			
		}
		System.out.println("Bye");
		
		
	}

}
