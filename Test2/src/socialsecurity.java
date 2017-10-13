
import java.text.NumberFormat;

public class socialsecurity {
	private String socialsecuritynum;
	private String personname;
	private String address;
	private int phonenum;
	private String dateofbirth;
	
	
	
	//construct methods
	public socialsecurity()
	{
    socialsecuritynum = "";
    personname="";
    address = "";
    phonenum = 0;
    dateofbirth = "";
  
    
    
    
    
    
	}
	//accessor method
	public void setsocialsecuritynum(String socialsecuritynum)
	{
		this.socialsecuritynum= socialsecuritynum;
		}
	public String getsocialsecuritynum()
	{
		return socialsecuritynum;
		}
	public void setpersonname(String personname){this.personname = personname;}
	public String getpersonname(String personname){return personname;}
	public void setaddress(String address){this.address = address;}
	public String getaddress(){return address;}
	public void setdateofbirth(String  dateofbirth){this.dateofbirth =  dateofbirth;}
	public String getdateofbirth(){return dateofbirth;}
	
	}
