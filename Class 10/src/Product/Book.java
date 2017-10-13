package Product;

//create subclass

public class Book extends Product{

private String author;  //field for the book class

public Book (){
	super();  //calls the constructor from the Product
	author = " ";
	count++;
}
//setter
public void setAuthor(String author){
this.author = author;
}
//getter
public String getAuthor(){
return author;
}
@Override
public String toString(){
return super.toString() + " by " + author;
}
}
