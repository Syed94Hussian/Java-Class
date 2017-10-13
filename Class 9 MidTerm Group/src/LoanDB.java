
public class LoanDB {
public static Loan setValue(double amount,double rate, int year)
{
	Loan value=new Loan();
	value.setLoanamount(amount);
	value.setInterestrate(rate);
	value.setYear(year);
	
	return value;
}
}
