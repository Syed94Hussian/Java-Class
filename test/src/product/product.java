package product;
import java.text.NumberFormat;
public class product {
	private String productCode;
	private String description;
	private double price;
	private int Quantity;
	
	public product()
	{
		productCode = "";
		description = "";
		price = 0;
		Quantity = 0;
	}
		
	//access methods		
		public void setCode (String code){this.productCode = code;}
		public String getCode(){return productCode;}
		
		
		
		public void setDescription(String description){this.description = description;}
		public String getDescription(){	return description;	}
		
		
		public void setPrice(double price){this.price = price;}
		public double getPrice (){return price;}
		
		public void setQuantity(int Quantity){this.Quantity= Quantity;}
		public int getQuantity(){return Quantity;}
		
		
		
//custom method for the price variable to format the price		
	public String getPriceFormatted()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceFormatted = currency.format(price);
		return priceFormatted;
	}
	public String getTotal(){
		double total = price * Quantity;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String stotal = currency.format(total);
		return stotal;
	}
	}