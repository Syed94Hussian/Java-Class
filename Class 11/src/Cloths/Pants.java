package Cloths;

public class Pants extends Cloths {
	
	private String brand;
	
	public Pants(){
		super();
		brand = " ";
		count++;
	}
	public void setBrand(String brand){
		this.brand = brand;

	}
	public String getBrand(){
		return brand;
	}
	@Override
	public String toString(){
		return super.toString() + "\n" + "Brand: " + brand;
}

	
}
