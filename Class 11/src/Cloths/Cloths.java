package Cloths;
import java.text.NumberFormat;

public class Cloths {
	//instance variable
	private String code;
	private String description;
	private double price;
	//private String brand;
	protected static int count = 0; //new line
	
	//the constructor creates an instance of the class and the initialize the instance variable to specify values
	//Constructed methods
		public Cloths(){
			/*code = "";
			description ="";
			price = 0;*/
		}
			
	//accessor methods
		public void setCode (String code){
			this.code = code;
		}
		public String getCode(){
			return code;
		}
		public void setDescription(String description){
			this.description = description;
		}
		public String getDescription(){
			return description;
		}
		public void setPrice(double price){
			this.price = price;
		}
		public double getPrice(){
			return price;
		}
		
		public String getPriceFormatted(){
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			//String priceFormated = currency.format(price);
			//return priceFormated;
			return currency.format(price); // modified
		}
		public static int getCount() {
			return count;
		}
		public String toString() {
			return description;
		}
	}