package Loan;
import java.util.*;
public class LoanApp {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the loan amount: ");
		double amount=sc.nextDouble();
		System.out.println("enter the interest rate: ");
		double rate=sc.nextDouble();
		System.out.println("enter the total finance year: ");
		int year=sc.nextInt();
		Loan account=LoanDB.setValue(amount,rate,year);
		account.returnAmorizationSchedule();
	}
}
