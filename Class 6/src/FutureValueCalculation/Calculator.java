package FutureValueCalculation;
import java.text.NumberFormat;
public class Calculator
{
private double monthlyInvestment;
private double yearlyInterestRate;
private int year;
private double futureValue;
private int i;
private int months;
double monthlyInterestAmount;
public Calculator()
{
	monthlyInvestment=0;
	yearlyInterestRate = 0;
	year = 0;
	futureValue =0;
	i =1;
	months = 0;
	monthlyInterestAmount=0;
}
public void setmonthlyInvestment(double monthlyInvestment)
{
	this.monthlyInvestment=monthlyInvestment;
}
public double getmonthlyInvestment()
{
	return monthlyInvestment;
}
public void setyearlyInterestRate(double yearlyInterestRate)
{
	this.yearlyInterestRate=yearlyInterestRate;
}
public double getyearlyInterestRate()
{
	return yearlyInterestRate;
}
public void setyear(int year)
{
	this.year=year;
	months = year*12;
}
public double year()
{
	return year;
}
public void setfutureValue(double futureValue)
{
	this.futureValue = futureValue;
}
public double getfutureValue()
{
	return futureValue;
}
public double monthlyInterestRate()
{
return yearlyInterestRate/12/100;
}
public double futureValue()
{
while(i<=months)
{
	futureValue=futureValue+monthlyInvestment;
	monthlyInterestAmount = futureValue*monthlyInterestRate();
	futureValue = futureValue+monthlyInterestAmount;
	i+=1;
	
}
return futureValue;
}
public void PrintToConsole()
{
	System.out.println("Future Value: "+NumberFormat.getCurrencyInstance().format(futureValue()));
	System.out.println();
}
}
