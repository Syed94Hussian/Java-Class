package Calc;

import java.util.Scanner;

import Product.Product;
import Product.ProductDB;

public class CalcApp {
	public static void main(String[] args) {
		
		//Display a welcome message
				System.out.println("Welcome to Grade Calculation");
				Scanner sc = new Scanner (System.in);
				
				String choice = "y";
				while (choice.equalsIgnoreCase("y")){
					
					//get the import from the user
					System.out.print("Enter your score ");
					System.out.println();
					double scoreNum = sc.nextDouble();
					
					//get the product object
					Calc calc = CalcDB.getCalc(scoreNum);
					
					/*Display the output
					String message = "\n" +
						"Score: " + calc.getScore() + "\n" +
						"Grade: " + calc.getGrade() + "\n" ;
					
					System.out.println(message);*/
					
					Calc p = new Calc (calc.getScore(), calc.getGrade()) ;
					
					p.printToConsole();
					p.printToConsole(calc.getScore(), calc.getGrade());

					
					//see if the user wants to continue
					System.out.print("Continue? (y/n): ");
					choice = sc.next();
					System.out.println();		
				}
				System.out.println("Application Ends.");
				
				
			}

	
}
