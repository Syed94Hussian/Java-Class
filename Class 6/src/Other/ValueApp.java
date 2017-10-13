//App

package Other;
import java.util.Scanner;
import java.text.NumberFormat;
public class ValueApp {

	public static void main(String[] args)
	{
			System.out.println("Welcome to the Future Value Calculator");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			String choice = "y";
			while(choice.equalsIgnoreCase("y"))
			{
				System.out.println("Enter monthly investment");
				double monthlyInvestment = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter yearly interest Rate");
				double yearlyInterestRate = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter numbers of year");
				int year = Integer.parseInt(sc.nextLine());
				
				Value otherObj = ValueDB.getValueDB(monthlyInvestment, yearlyInterestRate, year);
				otherObj.PrintToConsole();
				System.out.print("Continue?(y/n): ");
				choice= sc.nextLine();
				
			}
			System.out.println("Bye");
		}

	}

