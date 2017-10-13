//Luis Rizo
/* Author: Syed Hussain
 * Purpose: Learing String
 * Date: 06/21/17
 */

public class Class_2 {

	public static void main(String[] args) {
//hard coding the values
		String name2 = "hello";
		String name1 = "World";
		int value1 = 30;
		double value2 = .5;

//printing the string and values without adding them
		System.out.println(name1 + " " + name2 + " "+ value1+" "+value2);

//performing calculation(casting) 
		double total = value1*value2;
//then printing it
		//System.out.println(name1+" "+name2+" " + total); ->we can also do in a different way
		
		String message = 
				"message: " + name1 + " " + name2 + "\n" +
		"Values: " + value1+ " " + value2 + "\n" +
		"Total value: " + total + "\n";
				
				System.out.print(message);
		
		
	}

}
