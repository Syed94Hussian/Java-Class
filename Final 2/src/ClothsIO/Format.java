package ClothsIO;

import java.text.NumberFormat;
import java.util.*;

public class Format {
	
	private ArrayList <LineItem> lineItems;

	//the constructor
	
	public Format(){
		lineItems = new ArrayList();
	}
	
	//add an item to the Arraylist
	public void addItem(LineItem lineItem){
		
		lineItems.add(lineItem);
	}
	
	//get accessor for the constructor 
	public ArrayList<LineItem> getLineItems(){
		
		return lineItems;
	}
	
	//method that gets the invoice total
	public double getTotal(){
		double Total = 0;
		
		for(LineItem lineItem : lineItems){
			Total += lineItem.getTotal();	
		}
		return Total;
	}
	
	public String getPriceFormatted(){
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	return currency.format(getTotal());
	}
}
