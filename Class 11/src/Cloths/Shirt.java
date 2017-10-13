package Cloths;

public class Shirt extends Cloths {

	private String type;
	
	public Shirt(){
		super();
		type ="";
		count++;
	}
	
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
@Override
public String toString(){
	return super.toString()+ " \n " + "Type: " + type;
}
}
