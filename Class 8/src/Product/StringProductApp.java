package Product;

import java.util.*;

public class StringProductApp {

	public static void main(String[] args) {
		
//Display a welcome message
		System.out.println("Welcome to Product Application");
		Scanner sc = new Scanner (System.in);
		
		final int Code_Width = 10;
		final int Desc_Width = 20;
		final int Price_Width = 10;
		
		double value=0 ;
		
		StringBuilder list = new StringBuilder();
		
		
		list.append(StringUtil.Pad("Code", Code_Width));
		list.append(StringUtil.Pad("Decscription", Desc_Width));
		list.append(StringUtil.Pad("Price", Price_Width));
		list.append("\n");
		
		list.append(StringUtil.Pad("========= ", Code_Width));
		list.append(StringUtil.Pad("=================== ", Desc_Width));
		list.append(StringUtil.Pad("========= ", Price_Width));
		list.append("\n");


		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			
			//get the import from the user
			//System.out.print("Enter the product code: ");
			//System.out.println();
			//String productCode = sc.nextLine();
			
			//Product product = Console.getString("Enter the product code: ");
			String productCode = Console.getString("Enter the product code: ");

			
			//get the product object

			//Product product = ProductDB.getProduct(productCode);
			Product product = ProductDB.getProduct(productCode);

			
			//Display the output
			/*String message = "\n" +
				"Code: " + product.getCode() + "\n" +
				"Description: " + product.getDescription() + "\n" +
				"Price: " + product.getPrice() + "\n";*/
			//System.out.println(message);
			value += product.getPrice();
			
			list.append(StringUtil.Pad(product. getCode(), Code_Width));
			list.append(StringUtil.Pad(product. getDescription(), Desc_Width));
			
			//we use double.toString to convert double to string
			list.append(StringUtil.Pad(Double.toString(product. getPrice()), Price_Width));
			list.append("\n");
			
			//see if the user wants to continue
			System.out.print("Another Product? (y/n): ");
			choice = sc.nextLine();
			System.out.println();		
		}
		System.out.println(list);
		//list.append(Double.toString(value))
		System.out.printf("         Total: $%.2f \n", value);
		System.out.println("Application Ends.");
		
	}

}
