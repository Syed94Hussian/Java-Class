package Invoice;

public class InvoiceApp {
	
	public static void main(String [] args){
		
		System.out.println("Welcome to the Invoice Application \n");
		
		Invoice invoice = new Invoice();
		
		getLineItems(invoice);
		
		displayInvoice(invoice);
	}
	
	public static void getLineItems(Invoice invoice){
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			
			String productCode = Console.getString("Enter the product code: ");
			
			int quantity = Console.getInt("Enter the quantity: ");
			
			Product product = ProductDB.getProduct(productCode);
			
			invoice.addItem(new LineItem(product, quantity));
			
			
			choice = Console.getString("Another line item (y/n): ");
			System.out.println("\n");
		}
	}

	public static void displayInvoice(Invoice invoice){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(StringUtil.Pad("Description", 34));
		sb.append(StringUtil.Pad("Price", 34));
		sb.append(StringUtil.Pad("Qty", 5));
		sb.append(StringUtil.Pad("Total", 10));
		sb.append("\n");
		
		/*try to do the loop to call the array list as homework*/
		
		
		for(LineItem lineItem : invoice.getLineItems()){
			
			Product product = lineItem.getProduct();
			sb.append(StringUtil.Pad(product.getDescription(),34));
			sb.append(StringUtil.Pad(product.getPriceFormatted(),34));
			sb.append(StringUtil.Pad(lineItem.getQuantity(),5));
			sb.append(StringUtil.Pad(lineItem.getTotalFormatted(),10));
			

			sb.append("\n");
		}
		sb.append("\nInvoice Total: ");
		sb.append(invoice.getPriceFormatted());
		System.out.println(sb);

	}
	
}
