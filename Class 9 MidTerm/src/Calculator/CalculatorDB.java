
//database
package Calculator;

public class CalculatorDB 
{
public static Calculator getCalculatorDB(double loanAmount,double rate,int year)
{
	Calculator calculator = new Calculator();
	calculator.setRate(loanAmount);
	calculator.setRate(rate);
	calculator.setyear(year);
	
	return calculator;
}
}

