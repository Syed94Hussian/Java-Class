package product;

public class productDB 
{
public static product getProduct(String productCode)
{
	//get the product object
	product product = new product();
	
	//fill the Product object with data
	
	product.setCode(productCode);
	if(productCode.equalsIgnoreCase("java"))
	{
		product.setDescription("Java program");
		product.setPrice(57.50);
	}
	else if (productCode.equalsIgnoreCase("jsp"))
	{
		product.setDescription("Jsp programming");;
		product.setPrice(100.00);
	}
	else if (productCode.equalsIgnoreCase("mysql"))
	{
		product.setDescription("Mysql programming");;
		product.setPrice(4.50);
	}
	else
	{
		product.setDescription("Unknow");
		product.setPrice(0.00);

	}
	return product;

	
}
}