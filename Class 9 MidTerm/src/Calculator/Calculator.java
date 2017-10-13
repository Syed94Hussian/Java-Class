//business
/*package Calculator;
import java.lang.Math;
public class Calculator
{
	private double loanAmount; //user
	private double rate;//user
	private double monthInterest;
	private double paymentAmount; 
	private double totalInterestPaid;
	private int year;//user
	private double payment; // user monthly payment
	public double balance;
	private double principal;
	public int numPayment; // months
	public double term; //term = pow((1+rate/12.o), numPayment)
	public int i;

	
	public Calculator(){
		loanAmount = 0;
		rate=0;
		monthInterest = 0;
		paymentAmount =0;
		totalInterestPaid = 0;
		year =0;
		payment =0;
		balance=0;
		principal=0;
		numPayment=0;//months
		term=0;
		i=1;
	}

public void setRate(double rate){this.rate=rate;}
public double getRate(){return rate;}

public void setloanAmount(double loanAmount){this.loanAmount=loanAmount;}
public double getloanAmount(){return loanAmount;}

public void setmonthlyInterest(double monthlyInterest){
	monthInterest = (rate/12)*balance;}
//public double getmonthlyInterest(){return monthInterest;}

public void setpaymentAmount(double paymentAmount){
	this.paymentAmount=paymentAmount;
	paymentAmount = loanAmount*rate/12*term/(term -1.0);}
public double getpaymentAmount(){return paymentAmount;}

//public void settotalInterestPaid(double totalInterestPaid){this.totalInterestPaid=totalInterestPaid;}
//public double gettotalInterestPaid(){return totalInterestPaid;}

public void setyear(int year){
	this.year=year;
	numPayment = year*12;}//months
public double year(){return year;}

public void setprincipal(double principal){
	this.principal=principal;
	principal = payment - monthInterest;}//months
public double getprincipal(){return principal;}

public void setbalance(double balance){
	this.balance=balance;
	balance = balance - principal;}//months
//public double getbalance(){return balance;}

public double term(){
	return Math.pow((1+rate/12.0), numPayment);
}

public double monthInterest(){
	return (rate/12)*balance;
}
public double totalInterestPaid(){
	
	totalInterestPaid=totalInterestPaid+monthInterest;	

	return totalInterestPaid;
}
public void PrintToConsole()
{
	System.out.println();
	System.out.println("Month No. |   Interest Paid.  |    Principal Paid.  |    New Balance");
	System.out.println("------------------------------------------------------------------");
	while (i<=numPayment){

		System.out.println(i+"         |      " + monthInterest+"          |     "+ principal+"                |          "+balance);
		i++;
		
	}
	System.out.println();
}
}*/

