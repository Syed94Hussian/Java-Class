//ProductDB

package Product;

public class ProductDB {

	public static Product getProduct(String productCode){


             Product p =null;
		//get the product object
		//Product product = new Product();
		
		//fill the Product object with data
		//product.setCode(productCode);
      
        if(productCode.equalsIgnoreCase("java") || productCode.equalsIgnoreCase("jsp") || productCode.equalsIgnoreCase("mysql")){
             Book b =new Book();

		if(productCode.equalsIgnoreCase("java")){
			b.setCode(productCode);
			b.setDescription("java programming ");
			b.setPrice(57.51);
            b.setAuthor("Super Man") ;
		}
		else if(productCode.equalsIgnoreCase("jsp")){
            b.setCode(productCode);
			b.setDescription("jsp programming ");
			b.setPrice(50.00);
            b.setAuthor("Iron Man") ;
		}
		else if(productCode.equalsIgnoreCase("mysql")){
            b.setCode(productCode);
			b.setDescription("mysql programming");
			b.setPrice(54.50);
            b.setAuthor("Batman") ;}

		
		/*else {
			b.setDescription("Empty");
		}*/

           p = b; //new line set product object equal to the Book object
            }
           else if(productCode.equalsIgnoreCase("EclipseNeon")){
                Software s = new Software();
                
                s.setCode("EclipseNeon");
                s.setDescription("Eclipse Neon");
                s.setPrice(0.0);
                s.setVersion("Neon") ;
   
                p = s; //set Product object equal to the software object

           }
                return p;
}
}
