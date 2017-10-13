package GuiProduct;
import java.text.NumberFormat;

public class Product {
//instance variable
	private String code;
	private String description;
	//private String price;
	private double price;
	private int qnt;

//constructer methods
	public Product(){ 
		code = "";
		description ="";
		price = 0;
		qnt = 0;
	}
		
//accessor methods
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}
	public void setQnt(int qnt){
		this.qnt = qnt;
	}
	public int getQnt(){
		return qnt;
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
		this.price = price ;
	}
	public double getPrice(){
		return price = price;
	}
	
	public String getPriceFormatted(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceFormated = currency.format(price);
		return priceFormated;
	}
}
