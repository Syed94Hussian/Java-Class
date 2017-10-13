import java.util.*;
public class Main {

	public static void main(String[] args) {

		String[] month ={"January", "February", "March", "April", "May", "June", "July", 
						 "August","September", "Octobot", "November", "December"};
		
		Scanner sc = new Scanner(System.in);
		
		String choice ="y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter the number: ");
			int monthNum = Integer.parseInt(sc.nextLine());
			
			if(monthNum < 1 || monthNum > month.length){
				System.out.println("Your are out of range. Try again!");
				continue;
			}
			//Display output
			int monthIndex = monthNum -1;
			System.out.println("You have selected " + month[monthIndex]);
			
			System.out.print("Continue ? (y/n): ");
			
			choice = sc.nextLine();
			System.out.println();
				
			}
		System.out.println("Thank you. Bye!");
		}
		
	}


