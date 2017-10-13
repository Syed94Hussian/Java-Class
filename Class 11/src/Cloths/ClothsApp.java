// StringProductApp

package Cloths;

import java.util.*;

public class ClothsApp {

	public static void main(String[] args) {
		
//Display a welcome message
		System.out.println("Welcome to Cloth Application");
		Scanner sc = new Scanner (System.in);
		
		double value =0;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			

                 System.out.print("Enter product code: ");
                 String productCode = sc.nextLine();
			
                 Cloths product = ClothsDB.getCloths(productCode);

			System.out.println();
                  if(product!= null){
                        System.out.println("Description: " + product.toString());
                        System.out.println("Price: " + product.getPriceFormatted());
                        value += product.getPrice();
                        }
                  else{
                          System.out.println("No product matches this product code. \n");}
                  //new line
                  
                 
                  System.out.println();
		
			//see if the user wants to continue
			System.out.print("Another Product? (y/n): ");
			choice = sc.nextLine();
			System.out.println();		
		}
		
		
		System.out.println("Product count" + "\t" + "Total Cost");
        System.out.println("=============" +"\t" + "=================");
        System.out.println(Cloths.getCount() + "\t\t" + value);
        
        System.out.println();
		
		
		System.out.println("Application Ends.");
		
	}

}

