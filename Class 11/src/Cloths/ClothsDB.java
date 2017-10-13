//ClassDB

package Cloths;

public class ClothsDB {

	public static Cloths getCloths(String productCode){


		Cloths p =null;
		//get the product object
		//Product product = new Product();
		
		//fill the Product object with data
		//product.setCode(productCode);
      
        if(productCode.equalsIgnoreCase("Jeans") || productCode.equalsIgnoreCase("Trousers") || productCode.equalsIgnoreCase("Straight Pants")){
             Pants b =new Pants();

             if(productCode.equalsIgnoreCase("Jeans")){
				b.setCode(productCode);
				b.setDescription("Made in Bangladesh");
				b.setPrice(15.00);
	            b.setBrand("H&M") ;
		}
             else if(productCode.equalsIgnoreCase("Trousers")){
	            b.setCode(productCode);
				b.setDescription("Made in China");
				b.setPrice(10.00);
	            b.setBrand("GAP") ;
		}
             else if(productCode.equalsIgnoreCase("Straight Pants")){
	            b.setCode(productCode);
				b.setDescription("Made in Spain");
				b.setPrice(20.00);
	            b.setBrand("Old Navy") ;}

           p = b; //new line set product object equal to the Book object
            }
           else if(productCode.equalsIgnoreCase("Shirt")){
                Shirt s = new Shirt();
                
                s.setCode(productCode);
                s.setDescription("Made in Italy");
                s.setPrice(50.0);
                s.setType("Formal") ;
   
                p = s; //set Product object equal to the software object

           }
                return p;
}
}
