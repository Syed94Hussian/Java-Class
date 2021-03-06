import java.util.*;
public class LoanApp {
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Application");
		Scanner sc=new Scanner(System.in);
		
		final int Loan_Width = 15;
		final int Interest_Width = 15;
		final int Year_Width = 5;
		final int Payment_Width = 20;
		final int TInterest_Width = 20;

		
		double value=0 ;

		StringBuilder list = new StringBuilder();

		list.append(StringUtil.Pad("Loan Amount", Loan_Width));
		list.append(StringUtil.Pad("Interest rate", Interest_Width));
		list.append(StringUtil.Pad("Year", Year_Width));
		list.append(StringUtil.Pad("Payment Amount", Payment_Width));
		list.append(StringUtil.Pad("Total Interest", TInterest_Width));
		list.append("\n");
		
		
		list.append(StringUtil.Pad("============== ", Loan_Width));
		list.append(StringUtil.Pad("============== ", Interest_Width));
		list.append(StringUtil.Pad("==== ", Year_Width));
		list.append(StringUtil.Pad("=================== ", Payment_Width));
		list.append(StringUtil.Pad("=================== ", TInterest_Width));

		list.append("\n");


		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
				
			System.out.println("Enter the loan amount: ");
			double amount=sc.nextDouble();
			
			System.out.println("Enter the interest rate: ");
			double rate=sc.nextDouble();
			
			System.out.println("Enter the total finance year: ");
			int year=sc.nextInt();
		
			
			Loan account = LoanDB.setValue(amount,rate,year);

			
			list.append(StringUtil.Pad(Double.toString(account.getLoanamount()), Loan_Width));
			list.append(StringUtil.Pad(Double.toString(account.getInterestrate()), Interest_Width));
			list.append(StringUtil.Pad(Double.toString(account.getYear()), Year_Width));
			list.append(StringUtil.Pad(Double.toString(account.getpaymentAmount()), Payment_Width));
			list.append(StringUtil.Pad(Double.toString(account.getTotalInterestPaid()), TInterest_Width));
			list.append("\n");

			account.returnAmorizationSchedule();
			
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}
		System.out.println(list);

		System.out.println("Application Ends.");

		
		
		
		
		
	}
}
