import java.lang.Math;
//import java.text.DecimalFormat;
//import java.util.*;
public class Loan {
	private double loanamount;
	private double interestrate;
	private int year;
	private int numPayment;
	private double term;
	private double paymentAmount;
	private double discount;
	
	public Loan(){
		loanamount =0;
		interestrate =0;
		year =0;
		numPayment=0;
		term=0;
		paymentAmount=0;
		discount=0;
	}
	
	public void setLoanamount(double Loanamount){
		this.loanamount=Loanamount;}
	public double getLoanamount(){
		return loanamount;}
	
	public double getInterestrate(){
		return interestrate;}
	public void setInterestrate(double Interestrate){
		this.interestrate=Interestrate;}
	
	public void setYear(int Year){
		this.year=Year;}
	public int getYear(){
		return year;}
	
	public double getpaymentAmount(){
		numPayment = year*12; //year converted to month
		term = Math.pow((1+interestrate/12.0), numPayment);//using the formula from the question
		paymentAmount=loanamount*interestrate/12*term/(term-1.0);
		
		//using condition to find the discount
		double discountpercent;
    	if(paymentAmount>=2000)
    		discountpercent=0.2;
    	else if(paymentAmount>=1000 && paymentAmount<2000)
    		discountpercent=0.1;
    	else
    		discountpercent=0;
    	discount=discountpercent*paymentAmount;
    		paymentAmount=paymentAmount-discount;
		return paymentAmount;}
	
    public double getTotalInterestPaid(){
    	double balance=loanamount,monthInterest=0,Principal=0,TotalInterestPaid=0;
    	
    	//using loop to calculate the totalInterestPaid 
    	for(int i=1;i<=year*12;i++){
    		monthInterest=interestrate/12*balance;
    		Principal=getpaymentAmount()-monthInterest;
    		balance=balance-Principal;
    		TotalInterestPaid=TotalInterestPaid+monthInterest;
    	}
    	return TotalInterestPaid;}
    
    public void returnAmorizationSchedule(){
    	
    	System.out.printf("Loan Amount: %.2f",getLoanamount());
    	System.out.println();

    	System.out.printf("Interest Rate: %.2f",getInterestrate());
    	System.out.println();

    	System.out.printf("Number of Year Loan: %d",getYear());
    	System.out.println();

    	System.out.printf("Monthly Payment: %.2f",getpaymentAmount());
    	System.out.println();

    	System.out.printf("Discount payment: %.2f",getDicount());
    	System.out.println();

    	double balance=loanamount, monthInterest=0, Principal=0, TotalInterestPaid=0;
    	System.out.println("Month NO.     Interest Paid           Principal Paid           New Balance");
    	System.out.println("========= | =================    |   ==================    | =============== ");
    	for(int i=1;i<=year*12;i++){
    		monthInterest=interestrate/12*balance;
    		Principal=getpaymentAmount()-monthInterest;
    		balance=balance-Principal;
    		TotalInterestPaid=TotalInterestPaid+monthInterest;
    		
    		System.out.printf("%d\t\t%.2f\t\t\t%.2f\t\t\t%.2f",i,monthInterest,Principal,balance);
    		
    		System.out.println();
        	System.out.println("__________|______________________|_________________________|_____________________");

    	}
    	System.out.printf("Total interest paid over life of loan: $%.2f",getTotalInterestPaid());
    	System.out.println();
    }
    public double getDicount(){
    	return discount;}
}
