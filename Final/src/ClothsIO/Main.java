package ClothsIO;
import javax.swing.*;

//import ClothsIO.Product;
//import ProductIO.ProductIO;

import java.awt.TextField;
import java.awt.event.*;
import java.util.List;

public class Main implements ActionListener
{

		JFrame frame;
	    JButton list, add, del, calc, help, exit;

	    JLabel heading, row1label, row2label, row3label;
	    JTextField row1text, row2text;
	    JRadioButton row3yes, row3no;
	    ButtonGroup bg;
	    
	    //Main main = new Main();
		
	    public Main(){
		frame = new JFrame();

		heading = new JLabel("Welcome to the Invoice Application");
	    heading.setBounds(60,20,280,30);
		
	     //System.out.println("Welcome to the Product Manager\n");
	    row1label = new JLabel("Menu");
	    row1label.setBounds(160,60,200,30);
		
		list = new JButton("List");
		list.setBounds(80,80,200,30);
		
		add = new JButton("add");
		add.setBounds(80,100,200,30);
		
		del = new JButton("del");
		del.setBounds(80,120,200,30);
		
		calc = new JButton("calc");
		calc.setBounds(80,140,200,30);
		
		help = new JButton("help");
		help.setBounds(80,160,200,30);
		
		exit = new JButton("exit");
		exit.setBounds(80,180,200,30);
		
		frame.add(heading);
		frame.add(row1label);
		frame.add(list);
		frame.add(add);
		frame.add(del);
		frame.add(calc);
		frame.add(help);
		frame.add(exit);

		frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        list.addActionListener(this);
        add.addActionListener(this);
        del.addActionListener(this);
        calc.addActionListener(this);
        help.addActionListener(this);
        exit.addActionListener(this);
        
	}
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == list) {
                //show the whole list
            	displayAllCloths();
            }
            else if (e.getSource() == add) {
                //add new item
            	addCloth();
            }
            
            else if (e.getSource() == del) {
                //del an item
            	deleteCloth();
            }
            else if (e.getSource() == calc){
                //do calculation
            	new InvoiceApp();
            	
            }
            else if (e.getSource() == help){
            	//show list
            	displayMenu();
            }
            else{
            	//exit
            }
        }
            
	public static void displayMenu()
	{
		String message = "COMMAND MENU" + "\n" +
				"list   -List all products" + "\n" + 
				"add    -add a product" + "\n" +
				"del    -delete a  product" + "\n" +
				"help   -show this menu" + "\n" + 
				"exit   -Exit this application" + "\n";
		
		JOptionPane.showMessageDialog(null, message);
	
	}
	
	public static void displayAllCloths()
	{
		//System.out.println("PRODUCT LIST");
		
		List< Cloths > products = ClothsIO.getAll();
		
		if(products == null)
		{
			//System.out.println("\nError! Unable to get products.\n");
	    }
		else
		{
			Cloths p;
			StringBuilder sb = new StringBuilder();
			for (Cloths product : products)
			{
				p = product;
				sb.append(StringUtil.Pad(p.getCode(), 12));
				sb.append(StringUtil.Pad(p.getDescription(), 25));
				sb.append(p.getPriceFormatted());
				sb.append("\n");
				
			}
			
			JOptionPane.showConfirmDialog(null, sb);
		}
	}
	
	public static void addCloth()
	{
        JFrame input = new JFrame();
		TextField t1,t2,t3;
		
		
		
        
        JLabel message = new JLabel("Add");
        message.setBounds(160,10,150,30);

        JLabel code = new JLabel("Product code");
        code.setBounds(20,40,150,30);
        t1 = new TextField();//product code (l2)
		t1.setBounds(20, 70, 150, 20); 
		
		JLabel desc = new JLabel("Description");
        desc.setBounds(20,100,150,30);
        t2 = new TextField();//product code (l2)
		t2.setBounds(20, 130, 150, 20);
        
        JLabel jprice = new JLabel("Price");
        jprice.setBounds(20,160,80,30);
        t3 = new TextField();//product code (l2)
		t3.setBounds(20, 190, 150, 20); 
        
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(120, 220, 80, 30);
        addBtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
            
                String cd = t1.getText();
                //description to string
                String de = t2.getText();
                //price to double
                String sprice = t3.getText();
                double price = 0;
                try {
                    price = Double.parseDouble(sprice);
                } catch (Exception e) {}
                
                Cloths product = new Cloths();
                product.setCode(cd);
                product.setDescription(de);
                product.setPrice(price);
                
                ClothsIO.add(product);
                //System.out.println("\n" + description  + "was added to the database.\n");
                String m = de + "was added to the database.";
                JOptionPane.showMessageDialog(null, m);
            }
            
        });
		
		
		input.add(message);
		input.add(code);
		input.add(t1);
		input.add(desc);
		input.add(t2);
		input.add(jprice);
		input.add(t3);
		input.add(addBtn);


		input.setLayout(null);
		input.setVisible(true);
        input.setSize(350,300);
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void deleteCloth()
	{
		
		String code = JOptionPane.showInputDialog(null, "Enter code to Delate");
		
		Cloths cloth = ClothsIO.get(code);

		if (cloth ==  null)
		{
			JOptionPane.showMessageDialog(null,"\nError: Unable to get product.");
		}
		else
		{
			ClothsIO.delete(cloth);
			JOptionPane.showMessageDialog(null,"\nProduct Deleted.");

		}
		
	}
	
	
	
	
	
	
		public static void main(String[] args) 
		{
			new Main();
	}
	

}