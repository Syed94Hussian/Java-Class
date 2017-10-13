package Proj;

public class SizeI extends proj
{
	private String size;
	private double bust, waist, hips;
	private String country;
	public SizeI()
	{
		super();
		
		size = "";
		country = "";
		bust = 0;
		waist = 0;
		hips = 0;	
	}
	
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void setBust(double bust)
	{
		this.bust = bust;
	}
	public double getBust()
	{
		return bust;
	}
	public void setWaist(double waist)
	{
		this.waist = waist;
	}
	public double getWaist()
	{
		return waist;
	}
	public void setHips(double Hips)
	{
		this.hips = hips;
	}
	public double getHips()
	{
		return hips;
	}	
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return country;}}
	
	//database
	if((country == "AUS") || (country == "NZ"))
	{
	  if(bust <= 32.5 || waist <= 24.5 || hips <= 35)
	  {
		  System.out.println("The best fit for you is EXTRA SMALL(XS)");
		  System.out.println();
		  System.out.println("In number size it woould be a 2 or 4");
	  }
	  else if(bust >= 33.5 || waist >= 25.5 || hips >= 36)
	  {
		  System.out.println("The best fit for you is SMALL(S)");
		  System.out.println();
		  System.out.println("In number size it woould be a 6 or 8");
	  }
	 else if(bust >= 34 || waist >= 26 || hips >= 36.5)
	  {
		  System.out.println("The best fit for you is MEDIUM (M)");
		  System.out.println();
		  System.out.println("In number size it woould be a 10 or 12");
	  }
	 else if(bust >= 35 || waist >= 27 || hips >= 37.5)
	  {
		  System.out.println("The best fit for you is LARGE (L)");
		  System.out.println();
		  System.out.println("In number size it woould be a 14 or 16");
	  }
	  else if(bust >= 43.5 || waist >= 35.5 || hips >= 46)
	  {
		  System.out.println("The best fit for you is EXTRA LARGE (XL)");
		  System.out.println();
		  System.out.println("In number size it woould be a 16 or 18");
	  }
	}
	  else if(country == "Europe")
		{
		  if(bust <= 32.5 || waist <= 24.5 || hips <= 35)
		  {
			  System.out.println("The best fit for you is EXTRA SMALL(XS)");
			  System.out.println();
			  System.out.println("In number size it woould be a 0 or 2");
		  }
		 else if(bust >= 33.5 || waist >= 25.5 || hips >= 36)
		  {
			  System.out.println("The best fit for you is SMALL(S)");
			  System.out.println();
			  System.out.println("In number size it woould be a 4 or 6");
		  }
		 else if(bust >= 34 || waist >= 26 || hips >= 36.5)
		  {
			  System.out.println("The best fit for you is MEDIUM (M)");
			  System.out.println();
			  System.out.println("In number size it woould be a 6 or 8");
		  }
		 else if(bust >= 35 || waist >= 27 || hips >= 37.5)
		  {
			  System.out.println("The best fit for you is LARGE (L)");
			  System.out.println();
			  System.out.println("In number size it woould be a 10 or 12");
		  }
		 else if(bust >= 43.5 || waist >= 35.5 || hips >= 46)
		  {
			  System.out.println("The best fit for you is EXTRA LARGE (XL)");
			  System.out.println();
			  System.out.println("In number size it woould be a 14 or 16");
		  }
		}
