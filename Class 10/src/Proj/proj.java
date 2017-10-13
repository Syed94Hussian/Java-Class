package Proj;

public class proj
{
	protected String country;
	protected String size;
	protected String item;
	protected double length;
	
	public proj()
	{
		country = "";
		size = "";
		item = "";
		length = 0;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return country;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void setItem(String item)
	{
		this.item = item;
	}
	public String getItem()
	{
		return item;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getLength()
	{
		return length;
	}
}

