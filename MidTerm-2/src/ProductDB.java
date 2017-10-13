

public class ProductDB {

	public static Product getProduct(String productCode){
		//get the product object
		Product product = new Product();
		
		//Product product = null;
		
		//fill the Product object with data
		product.setCode(productCode);
		if(productCode.equalsIgnoreCase("java")){
			product.setDescription("java programming ");
			product.setPrice(57.51);
		}
		else if(productCode.equalsIgnoreCase("jsp")){
			product.setDescription("jsp programming ");
			product.setPrice(50.00);
		}
		else if(productCode.equalsIgnoreCase("mysql")){
			product.setDescription("mysql programming");
			product.setPrice(4.50);
		}
		else {
			product.setDescription("Invalide input");
		}
		return product;

	}
}
