package Other;

public class ValueDB 
{
public static Value getValueDB
(double monthlyInvestment,double yearlyInterestRate,int year)
{
	Value ValueObj = new Value();
	ValueObj.setmonthlyInvestment(monthlyInvestment);
	ValueObj.setyearlyInterestRate(yearlyInterestRate);
	ValueObj.setyear(year);
	
	return ValueObj;
}
}



