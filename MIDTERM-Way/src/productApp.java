import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.Scanner;
import java.util.function.Function;

public class productApp extends JFrame implements ActionListener 
{
	//Scanner sc = new Scanner(System.in);
	
	TextField t1,t2,t3;  
	JLabel l1,l2,l3,l4;
	JButton bEnt, bClr; //Declare the computing

		JFrame pa = new JFrame ("Product Application ");
		
		
		JPanel centerPanel = new JPanel();

		ResultSet rs = null;
		
		static String code = "";
		

		{
			
			t1 = new TextField("");
			t2 = new TextField("");
			t3 = new TextField("");
			l1 = new JLabel(" Welcome product Application");
			l2 = new JLabel("Enter the product code");


	        JTextField productC = new JTextField(10);
	        centerPanel.add(productC);
			//JOptionPane.showMessageDialog( null, productC );			

	        String productCode = productC.getText();
			
	        rs = productDB.setText(productCode);
	        
			
			l3 = new JLabel("Description");
			l4 = new JLabel("Price");
			bEnt = new JButton("Enter");
			bClr = new JButton("Clear");
			
			t1.setBounds(20, 20, 150, 20);
			t2.setBounds(20, 60, 150,20);
			t3.setBounds(20, 100, 150,20);
			l1.setBounds (20,140,150,20);
			l2.setBounds (20,180,150,20);
			l3.setBounds(20,220,150,20);
			l4.setBounds(20,260,150,20);
			bEnt.setBounds(20,300,150,20);
			bEnt.setBounds(20,340,150,20);
			
			
			pa.add(t1);
			pa.add(t2);
			pa.add(t3);
			pa.add(l1);
			pa.add(l2);
			pa.add(l3);
			pa.add(l4);
			pa.add(bEnt);
			pa.add(bClr);
					
			
			pa.setVisible(true);
			pa.setBounds(100, 100, 900, 900);
			pa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pa.setLayout(null);
	        
			t1.addActionListener(this);
			t2.addActionListener(this);
			t3.addActionListener(this);
			bEnt.addActionListener(this);
			bClr.addActionListener(this);
			
			
		}
		
		
		public void actionPerformed(ActionEvent e){
		
			product product = productDB.getProduct(code);
			if(e.getSource()==bEnt){
				String code = t1.getText();
				t2.setText(product.getDescription() );
				t3.setText(product.getPriceFormatted() );
				
			
			if(e.getSource()==bClr){
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
			
			
		}
		
		
	
	}
		
	
	public static void main(String[] args) 
	{
	
		new productApp();
}
}