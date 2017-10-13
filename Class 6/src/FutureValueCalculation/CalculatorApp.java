package FutureValueCalculation;
import java.util.Scanner;
import java.text.NumberFormat;
public class CalculatorApp 
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Future Value Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter monthly investment");
			double monthlyInvestment = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter yearly interest Rate");
			double yearlyInterestRate = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter numbers of year");
			int year = Integer.parseInt(sc.nextLine());
			
			Calculator calculator = CalculatorDB.getCalculatorDB(monthlyInvestment, yearlyInterestRate, year);
			calculator.PrintToConsole();
			System.out.println("Continue?(y/n): ");
			choice= sc.next();
			System.out.println();
		}
		System.out.println("Bye");
	}

}
