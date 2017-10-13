package Product;

import java.util.*;

public class ProductApp {

	public static void main(String[] args) {
		
//Display a welcome message
		System.out.println("Welcome to Product APPlication");
		Scanner sc = new Scanner (System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			
			//get the import from the user
			System.out.print("Enter the product code: ");
			System.out.println();
			String productCode = sc.nextLine();
			
			//get the product object
			Product product = ProductDB.getProduct(productCode);
			
			//Display the output
			String message = "\n" +
				"Code: " + product.getCode() + "\n" +
				"Description: " + product.getDescription() + "\n" +
				"Price: " + product.getPrice() + "\n";
			
			System.out.println(message);
			
	//see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();		
		}
		System.out.println("Application Ends.");
		
	}

}
