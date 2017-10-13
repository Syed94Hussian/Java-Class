package GuiProduct;
import java.awt.*;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.*;
public class StringProductApp {

	public static void main(String[] args) {

	//Display a welcome message
		//System.out.println("Welcome to Product Application");
		JOptionPane.showMessageDialog(null,"Welcome to Product Application");
		Scanner sc = new Scanner (System.in);
		
		final int Code_Width = 15;
		final int Desc_Width = 25;
		final int Qnt_Width = 5;
		final int Price_Width = 10;

		
		double value=0 ;
		
		StringBuilder list = new StringBuilder();
		
		Product p = new Product();
		
		list.append(StringUtil.Pad("Code", Code_Width));
		list.append(StringUtil.Pad("Decscription", Desc_Width));
		list.append(StringUtil.Pad("Qnt", Price_Width));
		list.append(StringUtil.Pad("Price", Price_Width));
		list.append("\n");
		
		/*list.append(StringUtil.Pad("=====", Code_Width-5));
		list.append(StringUtil.Pad("==========", Desc_Width-5));
		list.append(StringUtil.Pad("====", Qnt_Width));
		list.append(StringUtil.Pad("=====", Price_Width));
		list.append("\n");*/


		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			
			
			//String an = JOptionPane.showInputDialog("Enter the loan amount: ");

			String productCode = JOptionPane.showInputDialog("Enter the Product code: ");
			
			String Qnt = JOptionPane.showInputDialog("Enter the Quantity code: ");

			int quantity = Integer.parseInt(Qnt);
			
			
				double total = quantity * p.getPrice();
				
				p.setQnt(quantity);
				
				String stotal = Double.toString(total);
			

			//String productQnt = JOptionPane.showInputDialog("Enter the Quantity: ");

			//get the product object

			//Product product = ProductDB.getProduct(productCode);
			Product product = ProductDB.getProduct(productCode);

		
			value += product.getPrice();			
			
			list.append(StringUtil.Pad(product. getCode(), Code_Width));
			list.append(StringUtil.Pad(product. getDescription(), Desc_Width));
			
			//we use double.toString to convert double to string
			//list.append(StringUtil.Pad(Integer. toString(product. getQnt()), Qnt_Width));
			list.append(StringUtil.Pad(Double.toString(quantity), Qnt_Width));

			list.append(StringUtil.Pad(Double.toString(product. getPrice()*quantity), Price_Width));

			list.append("\n");
			
			
			JOptionPane.showMessageDialog(null, list);			
			//see if the user wants to continue
			//System.out.print("Another Product? (y/n): ");
			choice = JOptionPane.showInputDialog("Another Product? (y/n): ");
			//choice = sc.nextLine();
			//System.out.println();		
		}
		DecimalFormat df = new DecimalFormat("#.00"); 


		//JOptionPane.showMessageDialog( null, list );
		JOptionPane.showMessageDialog(null,list+ "\nTotal: $" + df.format(value) + "\nApplication Ends.");
		//System.out.println(list);
		//list.append(Double.toString(value))
		/*System.out.printf("\tTotal: $%.2f \n", value);
		System.out.println("Application Ends.");*/
		
		//JPanel message = new JPanel());
		
		/*JFrame window = new JFrame("Milage Conversion");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);
        window.setLayout(null);
        window.setResizable(false);
        
        window.showMessageDialog(null, list);

        */
         }
	  
}
        
