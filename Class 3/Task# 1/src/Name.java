/*Author: Syed Hussain
 * Purpose: Within a main method initialize String variables for your first and last name. Then, print these String variables to the console in the format
 * 			Name: LastName, FirstName
 * 			Run the application
 * 			Add an assignment statement that changes the value of the variable for the firstname
 * 			Run the application(print to the console) 
 * Date: 06/22/17
 * */
import java.util.*;
public class Name {

	public static void main(String[] args) {
		System.out.println("ENTER YOUR LASTNAME AND FIRSTNAME");
		
		Scanner sc = new Scanner(System.in);
		String lastName, firstName;
		
		lastName = sc.nextLine();
		firstName = sc.nextLine();
		
		System.out.println(lastName + "," + firstName);
		System.out.println("Change your first name and give initial");
		
		firstName= sc.nextLine();
		
		System.out.println(lastName + "," + firstName);
	}

}
