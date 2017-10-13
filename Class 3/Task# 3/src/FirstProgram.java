/*Author: Syed Hussain
 * Purpose:Calculate tax an grand total(Program: calTax)
 * Date: 06/22/17
 * */
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {

		System.out.println("Welcome to Mac190 Class");
		System.out.println();
		
		
		//hard code three variable
		//String productCode = "Java";
		String productCode = "android";
		//double price = 14.95;
		double price = 57.5;
		int quantity = 2;
		double TaxPercent = 7.5;
		
		//Perform a calculation
		double total = price * quantity;
		
		double TaxAmount = total * (TaxPercent / 100);
		
		double GrandTotal = total + TaxAmount;
		
		//Display the output
		String message = 
				"Code: " + productCode + "\n" +
				"Description: Programming" + "\n" +
				"Price: " + price + "\n" + 
				"Quantity: " + quantity + "\n" +
				"Total: " + total + "\n" + 
				"Tax Percent: " + TaxPercent + "\n" +
				"Tax Total: " + TaxAmount + "\n" + 
				"Grand Total: " + GrandTotal + "\n";
				
		System.out.println(message);
		
			
	}

}
