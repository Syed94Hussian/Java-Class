import java.lang.Math;
import java.util.*;
public class Loan {
	private double loanamount;
	private double interestrate;
	private int year;
	private int numPayment;
	private double term;
	private double paymentAmount;
	private double discount;
	public void setLoanamount(double Loanamount)
	{
		this.loanamount=Loanamount;
	}
	public void setInterestrate(double Interestrate)
	{
		this.interestrate=Interestrate;
	}
	public void setYeay(int Year)
	{
		this.year=Year;
	}
	public double getLoanamount()
	{
		return loanamount;
	}
	public double getInterestrate()
	{
		return interestrate;
	}
	public int getYear()
	{
		return year;
	}
	public double getpaymentAmount()
	{
		numPayment=year*12;
		term=Math.pow((1+interestrate/12.0), numPayment);
		paymentAmount=loanamount*interestrate/12*term/(term-1.0);
		double discountpercent;
    	if(paymentAmount>=2000)
    		discountpercent=0.2;
    	else if(paymentAmount>=1000&&paymentAmount<2000)
    		discountpercent=0.1;
    	else
    		discountpercent=0;
    	discount=discountpercent*paymentAmount;
    		paymentAmount=paymentAmount-discount;
		return paymentAmount;
	}
    public double getTotalInterestPaid()
    {
    	double balance=loanamount,monthInterest=0,Principal=0,TotalInterestPaid=0;
    	for(int i=1;i<=year*12;i++)
    	{
    		monthInterest=interestrate/12*balance;
    		Principal=getpaymentAmount()-monthInterest;
    		balance=balance-Principal;
    		TotalInterestPaid=TotalInterestPaid+monthInterest;
    	}
    	return TotalInterestPaid;
    }
    public void returnAmorizationSchedule()
    {
    	System.out.println("Loan Amount: "+getLoanamount());
    	System.out.println("Interest Rate: "+getInterestrate());
    	System.out.println("Number of Year Loan: "+getYear());
    	System.out.println("Monthly Payment: "+getpaymentAmount());
    	System.out.println("Discount payment: "+getDicount());
    	double balance=loanamount,monthInterest=0,Principal=0,TotalInterestPaid=0;
    	System.out.println("month NO.      Interest Paid               Principal Paid           New Balance");
    	for(int i=1;i<=year*12;i++)
    	{
    		monthInterest=interestrate/12*balance;
    		Principal=getpaymentAmount()-monthInterest;
    		balance=balance-Principal;
    		TotalInterestPaid=TotalInterestPaid+monthInterest;
    		System.out.println(i+"            "+monthInterest+"           "+Principal+
    				"       "+balance);
    	}
    	System.out.println("the total interest paid is: "+getTotalInterestPaid());
    }
    public double getDicount()
    {
    	return discount;
    }
}
