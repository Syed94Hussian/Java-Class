package Product;
import java.text.NumberFormat;
public class Product {
//instance variable
	private String code;
	private String description;
	private double price;
	
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
}
