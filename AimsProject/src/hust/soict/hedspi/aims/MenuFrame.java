package hust.soict.hedspi.aims;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.order.Order;

public class MenuFrame extends JFrame{
	JButton createButton = new JButton("Create new Order");;
	JButton addButton = new JButton("Add item to the order");
	JButton deleteButton = new JButton("Delete item by Id");
	JButton displayButton =  new JButton("Display the items of list order ");
	JButton exitButton = new JButton("Exit");
	private static Order anOrder;
	
	public MenuFrame(JFrame frame) {
		// Draw frame
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,450);
		setResizable(false);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - 500))/2;
		int y = (int) ((dimension.getHeight() - 450))/2;
		setLocation(x, y);
		setVisible(true);
		setTitle("Order System");
		
//		addExitButton();
		// Button Create new order
		createButton.setSize(300, 60);
		createButton.setLocation(100,20);
		createButton.setFocusPainted(false);
		createButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				anOrder = Order.createdOrder();
				if (anOrder != null)
					JOptionPane.showMessageDialog(null,"Create new Order successfully");
				else {
					JOptionPane.showMessageDialog(null,"The limitted orders is almost full","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		add(createButton);
		
		// Button add item into order
		addButton.setSize(300, 60);
		addButton.setLocation(100,100);
		addButton.setFocusPainted(false);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(anOrder != null) {
					// Create Frame Dialog
					new AddMediaDialog();
				}else {
					JOptionPane.showMessageDialog(null,"Please create an order","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		add(addButton);
		
		// Button delete an item from order
		deleteButton.setSize(300, 60);
		deleteButton.setLocation(100,180);
		deleteButton.setFocusPainted(false);
		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(anOrder != null) {
					
				}else {
					JOptionPane.showMessageDialog(null,"Please create an order","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		add(deleteButton);
		
		displayButton.setSize(300, 60);
		displayButton.setLocation(100,260);
		displayButton.setFocusPainted(false);
		displayButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(anOrder != null) {
					
				}else {
					JOptionPane.showMessageDialog(null,"Please create an order","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		add(displayButton);
		
		exitButton.setSize(300, 60);
		exitButton.setLocation(100,340);
		exitButton.setFocusPainted(false);
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);

		setVisible(true);
		
	}
	
}
