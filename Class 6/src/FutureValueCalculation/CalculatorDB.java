package FutureValueCalculation;
public class CalculatorDB 
{
public static Calculator getCalculatorDB(double monthlyInvestment,double yearlyInterestRate,int year)
{
	Calculator calculator = new Calculator();
	calculator.setyearlyInterestRate(yearlyInterestRate);
	calculator.setmonthlyInvestment(monthlyInvestment);
	calculator.setyear(year);
	
	return calculator;
}
}

