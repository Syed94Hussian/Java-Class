
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Product {
//instance variable
	private String code;
	private String description;
	//private String price;
	private double price;
	protected static int count = 0;//New line

//constructer methods
	public Product(){ 
		code = "";
		description ="";
		price = 0;
	}
		
//accessor methods
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}											
	public void setDescription(String description){
		this.description = description;				
	}
    //if we don't use same name then we don't have to use *this*
	   /*public void setDescription(String d1){
		d1 = description;				
	   }*/
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
		String priceFormated = currency.format(price);
		return priceFormated;
	}
	@Override
	public String toString() {
		return description;
	}
	public static int getCount() {
		return count;
	}
	public void printToConsole(String separator)
	{
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		System.out.println(code + separator + description + separator + formatter.format(price));
	}
	public void printToConsole()
	{
		printToConsole("|");
	}
	public void printToConsole(String separator, String label)
	{
		System.out.print(label);//System.out.println(label);
		printToConsole(separator);
	}
}
