package ClothsIO;

import java.text.NumberFormat;
public class LineItem {
	//public class LineItems{
		//2 data members
		
		private Cloths product;
		private int quantity;
		
		public LineItem(){
			this.product = null;
			this.quantity = 0;
		}
		
		public LineItem(Cloths product, int quantity){
			this.product = product;
			this.quantity = quantity;
		}
		
		public void setProduct(Cloths product){
			this.product = product;
		}
		public Cloths getProduct(){
			return product;
		}
		public void setQuantity(int quantity){
			this.quantity = quantity;
		}
		public String getQuantity(){
			int quantity = this.quantity;
			String Squantity = Integer.toString(quantity);
			
			return Squantity;
		}
		
		public double getTotal(){
			double total = quantity * product.getPrice();
			return total;
		}
		
		public String getTotalFormatted(){
			double total = this.getTotal();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String totalFormatted = currency.format(total);
			return totalFormatted;
		}	
	}
//}
