
package Other;
import java.text.NumberFormat;
public class Value
{
private double monthlyInvestment;
private int year;
private double futureValue;
public int i;
public int months;
double yearlyInterestRate;
public double monthlyInterestAmount;

//default constructor
public Value()
{
	monthlyInvestment=0;
	yearlyInterestRate = 0;
	year = 0;
	futureValue =0;
	i =1;
	months = 0;
	monthlyInterestAmount=0;
}

//Acessor

// I dont hava to use get set for i, monthlyInterestRate, months and monthlyInterestAmount
//i don't have to use get because i don't have to access any needed value for this calculation
public void setmonthlyInvestment(double monthlyInvestment){
	this.monthlyInvestment=monthlyInvestment;}

/*public double getmonthlyInvestment(){
	return monthlyInvestment;}*/

public void setyearlyInterestRate(double yearlyInterestRate){
	this.yearlyInterestRate=yearlyInterestRate;}

/*public double getyearlyInterestRate(){
	return yearlyInterestRate;}*/

public void setyear(int year){
	this.year=year;
	months = year*12;} // to get the months from the year we don't need to use a constructor for month

public void setfutureValue(double futureValue){
	this.futureValue = futureValue;}

//

public double monthlyInterestRate(){ //  I use constructor
	return yearlyInterestRate/12/100;} // to get the monthly Interest Rate

/*public double getfutureValue(){
	return futureValue;}*/

public double futureValue(){
	while(i<=months){
		futureValue=futureValue+monthlyInvestment;
		monthlyInterestAmount = futureValue*monthlyInterestRate();
		futureValue = futureValue+monthlyInterestAmount;
		i+=1;}
	return futureValue;}

public void PrintToConsole(){
	System.out.println("Future Value: "+NumberFormat.getCurrencyInstance().format(futureValue()));
	System.out.println();}
}
