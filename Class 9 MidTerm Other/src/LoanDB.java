
public class LoanDB {
public static Loan setValue(double amount,double rate, int year)
{
	Loan value=new Loan();
	value.setInterestrate(rate);
	value.setLoanamount(amount);
	value.setYeay(year);
	return value;
}
}
