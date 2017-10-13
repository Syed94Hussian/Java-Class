package product;
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JLabel;


public class productApp implements ActionListener 
{

		JFrame pa = new JFrame ("Product Application ");
		TextField t1,t2,t3,t4,t5;
		JLabel l1,l2,l3,l4,l5,l6;
		JButton bEnt, bDel, bnull; //Declare the component
		
		static String code = "";
				
		public productApp(){
			
			product p = new product();
			l1 = new JLabel(" Welcome product Application");
			l1.setBounds (20,20,200,40);

			l2 = new JLabel("Enter the product code");
			l2.setBounds (20, 80, 150, 20);
			t1 = new TextField();//product code (l2)
			t1.setBounds(20, 100, 150, 20); 

			
			l5 = new JLabel("Quantity");
			l5.setBounds(200,80,150,20);
			t4= new TextField();//quantity (l5)
			t4.setBounds(200, 100, 150,20);
			/*String squantity = t4.getText();
			int quantity = Integer.parseInt(squantity);
			p.setQuantity(quantity);*/
			
			l3 = new JLabel("Description");
			l3.setBounds(20,240,150,20);
			t2 = new TextField();//description (l3)
			t2.setBounds(20, 260, 150,20);

			
			l4 = new JLabel("Price");
			l4.setBounds(200,240,150,20);
			t3 = new TextField();//price (l4)
			t3.setBounds(200, 260, 150,20);

			

			l6 = new JLabel ("Total");
			l6.setBounds(20,320,150,20);
			t5 = new TextField();//total (l6)
			t5.setBounds(20, 340, 150,20);

			bEnt = new JButton("Enter");
			bEnt.setBounds(200,140,150,20);

			bDel = new JButton("Clear");
			bDel.setBounds(20,140,150,20);
			
			bnull = new JButton();
			bnull.setBounds(400,140,150,20);
			
			pa.add(t1);
			pa.add(t2);
			pa.add(t3);
			pa.add(t4);
			pa.add(t5);
			
			pa.add(l1);
			pa.add(l2);
			pa.add(l3);
			pa.add(l4);
			pa.add(l5);
			pa.add(l6);
			
			pa.add(bEnt);
			pa.add(bDel);
			pa.add(bnull);
			
			
			pa.setVisible(true);
			pa.setBounds(400,500,400,500);
			pa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //make window exit application close
			pa.setLayout(null);                                  
			                                                     
			t1.addActionListener(this);                             
			t2.addActionListener(this);
			t3.addActionListener(this);
			t4.addActionListener(this);
			t5.addActionListener(this);
				
			bEnt.addActionListener(this);
			bDel.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e){
		
			code = t1.getText();
            
			product s = productDB.getProduct(code);
            int qty = Integer.parseInt(t4.getText());
            s.setQuantity(qty);

			if(e.getSource()==bEnt){
				
				t2.setText(s.getDescription() );
				t3.setText(s.getPriceFormatted() );
				
				t5.setText(s.getTotal());		
				}
				
			else if(e.getSource()==bDel)
				{
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
				}
		}
	
	
	public static void main(String[] args)    // the entry main method
	{
	
		new productApp();                  
}
}