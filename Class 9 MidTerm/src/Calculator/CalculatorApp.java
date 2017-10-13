package Calculator;
import java.util.Scanner;
import java.text.NumberFormat;
public class CalculatorApp 
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Loan Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter Loan Amount: ");
			double loanAmount = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter Interest Rate: ");
			double rate = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter numbers of year for Loan: ");
			int year = Integer.parseInt(sc.nextLine());
			
			Calculator calculator = CalculatorDB.getCalculatorDB(loanAmount, rate, year);
			calculator.PrintToConsole();
			System.out.println("Continue?(y/n): ");
			choice= sc.next();
			System.out.println();
		}
		System.out.println("Bye");
	}

}

