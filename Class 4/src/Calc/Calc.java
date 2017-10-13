package Calc;
import java.text.NumberFormat;

public class Calc {
	//instance variable
		private double score;
		private String grade;
		
	//constructer methods
		public Calc(){ 
			score = 0;
			grade = "";
		}
		public Calc(double newScore, String newGrade){
			newScore = score;
			newGrade = grade;
		}
			
	//accessor methods
		public void setScore(double score){
			this.score = score;
		}
		public double getScore(){
			return score;
		}											
		public void setGrade(String grade){
			this.grade = grade;				
		}
	  //if we don't use same name then we don't have to use *this*
		  /*public void setDescription(String d1){
		  d1 = description;				
		   }*/
		public String getGrade(){
			return grade;
		}
	//Formating
		/*public String getPriceFormatted(){
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String priceFormated = currency.format(score);
			return priceFormated;
		}*/
	//OverLoading
		public void printToConsole(){
			System.out.print("Error try againg");
		}
		public void printToConsole(double score, String grade){
			System.out.print("Score: " +  score + "\n" + "Grade: "+ grade + "\n");
				}
}
