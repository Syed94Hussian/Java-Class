import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class InvoiceApp implements ActionListener{

	JFrame f;
	JTextField pcode;
	JTextField qnt;
	JTextField choice;
	//Components
	JButton b1,b2;
	
	//Variables
	
	static double a =0, b=0, result =0;
	//static String pcode = "";
	
	static int operator=0; // for the operation to perform
	
	//constructor
	{
	f = new JFrame("Product Application"); // set the title for the frame
	pcode = new JTextField(); //testField component
	qnt = new JTextField();
	choice = new JTextField();

	//buttons to perform operations
	
	b1 = new JButton("Enter");
	b2 = new JButton("Choice");
	
	
	//JFrame frame = new JFrame("Title for your window");

	//JPanel panel = new JPanel();
	JLabel label1 = new JLabel("Product Code");
	label1.setBounds(300,40,300,30);
	
	JLabel label2 = new JLabel("Quantity");
	label2.setBounds(300,80,180,30);
	
	//f.add(label1);
	//f.add(label2);

	//buttons to perform operations

	//position and size of the components in the GUI
	
	//row 1
	pcode.setText("Product Code");
	pcode.setBounds(30,40,300,30);//position and the size of the textField component
	
	//row 2
	pcode.setText("");
	qnt.setBounds(30,80,300,30);
	
	//row 3
	b1.setBounds(30,120,180,30);//enter
	
	
	
	//last part
	JLabel label3 = new JLabel("Continue(y/n)");
	label3.setBounds(160,475,180,30);
	choice.setBounds(450/4,450,180,30);//choice
	b2.setBounds(450/4,500,180,30);
	f.add(label3);
	
	
	//add the components to the frame
	f.add(pcode); //add the textField component
	f.add(qnt);
	f.add(choice);

	
	//row 3
	f.add(b1);
	f.add(b2);
	
	
	
	//setting of component
	f.setLayout(null);//tell the compiler to not use the default setting
	
	f.setVisible(true);
	f.setSize(450,600);//set the height and width for the frame
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	f.setResizable(false);
	
	//Action Listeners
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	Invoice invoice = new Invoice();

	displayInvoice(invoice);
	getLineItems(invoice);
	
	
	
}

public void actionPerformed(ActionEvent e){
	
	if(e.getSource()==b1){
		pcode.setText("");
	qnt.setText("");}

	if(e.getSource()==b2){
		choice.setText("");}
	
		pcode.setText(""+result);
		}

	public static void main(String [] args){
		
		new InvoiceApp();
		
	}
	
	public static void getLineItems(Invoice invoice){
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			
	        JPanel centerPanel = new JPanel();

	        JTextField productC = new JTextField(10);
	        centerPanel.add(productC);
	        
	        String productCode = productC.getText();
	        
			
			//int quantity = Console.getInt("Enter the quantity: ");
	        JTextField productQ = new JTextField(5);
	        centerPanel.add(productQ);
	        
	        String productQuantity = productQ.getText();
	        
	        int productQnt = Integer.parseInt(productQuantity);

	        
			Product product = ProductDB.getProduct(productCode);
			
			invoice.addItem(new LineItem(product, productQnt));
			
			
			choice = Console.getString("Another line item (y/n): ");
			System.out.println("\n");
		}
	}

	public static void displayInvoice(Invoice invoice){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(StringUtil.Pad("Description", 34));
		sb.append(StringUtil.Pad("Price", 34));
		sb.append(StringUtil.Pad("Qty", 5));
		sb.append(StringUtil.Pad("Total", 10));
		sb.append("\n");
		
		/*try to do the loop to call the array list as homework*/
		
		
		for(LineItem lineItem : invoice.getLineItems()){
			
			Product product = lineItem.getProduct();
			sb.append(StringUtil.Pad(product.getDescription(),34));
			sb.append(StringUtil.Pad(product.getPriceFormatted(),34));
			sb.append(StringUtil.Pad(lineItem.getQuantity(),5));
			sb.append(StringUtil.Pad(lineItem.getTotalFormatted(),10));
			

			sb.append("\n");
		}
		sb.append("\nInvoice Total: ");
		sb.append(invoice.getPriceFormatted());
		System.out.println(sb);

	}
	
}
