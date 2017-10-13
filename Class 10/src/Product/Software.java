package Product;

//create subclass

public class Software extends Product{

	private String version;  //field for the version class

	public Software (){
		super();  //calls the constructor from the Product
		version = " "; 
		count++;
}
//setter
	public void setVersion (String version){
		this. version = version;
}
//getter
	public String getVersion (){
		return version;
}
@Override
	public String toString(){
		return super.toString() + " " + version;
}
}
