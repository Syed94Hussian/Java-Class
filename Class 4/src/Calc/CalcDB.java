package Calc;

public class CalcDB {
	public static Calc getCalc(double scoreNum){
		//get the product object
		Calc calc = new Calc();
		
		//fill the Product object with data
		calc.setScore(scoreNum);
		if(scoreNum >= 90){
			calc.setGrade("A");
		}
		else if(scoreNum >= 80){
			calc.setGrade("B");
		}
		else if(scoreNum >= 70){
			calc.setGrade("C");
		}
		else {
			calc.setGrade("Fail");
		}
		return calc;

	}
}
