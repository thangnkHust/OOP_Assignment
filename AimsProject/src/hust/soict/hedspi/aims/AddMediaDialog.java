package hust.soict.hedspi.aims;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddMediaDialog {
	private JDialog selectDialog = new JDialog();
	private JButton bookButton;
	private JButton dvdButton;
	private JButton cdButton;
	
	public AddMediaDialog() {
		// Set Dialog size 
		selectDialog.setSize(500,450);
		selectDialog.getContentPane().setLayout(null);
		selectDialog.setResizable(false);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - 500))/2;
		int y = (int) ((dimension.getHeight() - 450))/2;
		selectDialog.setLocation(x, y);
//		selectDialog.setVisible(false);
		selectDialog.setModal(true);
		selectDialog.setTitle("Select Media");
		
		// Button Add Book 
		bookButton = new JButton("Book");
		bookButton.setSize(300, 60);
		bookButton.setLocation(100,55);
		bookButton.setFocusPainted(false);
		selectDialog.getContentPane().add(bookButton);
			addBookAction();
		
		// Button Add DVD
		dvdButton = new JButton("DVD");
		dvdButton.setSize(300, 60);
		dvdButton.setLocation(100,170);
		dvdButton.setFocusPainted(false);
		selectDialog.getContentPane().add(dvdButton);
			addDVDAction();
		
		cdButton = new JButton("CD");
		cdButton.setSize(300, 60);
		cdButton.setLocation(100,288);
		cdButton.setFocusPainted(false);
		selectDialog.getContentPane().add(cdButton);
			addCDAction();
		
		selectDialog.setVisible(true);
	}
	
	public void addBookAction() {
		bookButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Book");
				selectDialog.setVisible(false);
				JDialog bookDialog = new JDialog();
				
				// Common dialog of Media
				addMediaDialog(bookDialog);
				
				// Author
				JTextField authorField = new JTextField();
				JLabel authorJLabel = new JLabel("Author");
				authorJLabel.setSize(100,30);
				authorJLabel.setLocation(90,180);
				bookDialog.add(authorJLabel);
				
				authorField.setSize(250, 30);
				authorField.setLocation(200,180);
				bookDialog.add(authorField);
				
				JLabel noteJLabel = new JLabel("* Cac author cach nhau boi dau phay ' , '");
				noteJLabel.setSize(300,40);
				noteJLabel.setLocation(100,220);
				bookDialog.add(noteJLabel);
				// xu ly button okie
				bookDialog.setVisible(true);
			}
		});
	}
	
	public void addDVDAction() {
		dvdButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("DVD");
			}
		});
	}
	
	public void addCDAction() {
		cdButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CD");
			}
		});
	}
	
	private void addMediaDialog(JDialog mediaDialog) {
		JLabel idJLabel = new JLabel("ID");
		JLabel costJLabel = new JLabel("Cost");
		JLabel categoryJLabel = new JLabel("Category");
		JLabel titleJLabel = new JLabel("Title");
		
		JTextField idField = new JTextField();
		JTextField costField = new JTextField();
		JTextField cateField = new JTextField();
		JTextField titleField = new JTextField();
		
		JButton okJButton = new JButton("OK");

		mediaDialog.setSize(500,450);
		mediaDialog.setLayout(null);
		mediaDialog.setResizable(false);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - 500))/2;
		int y = (int) ((dimension.getHeight() - 450))/2;
		mediaDialog.setLocation(x, y);
		
		idJLabel.setSize(100,30);
		idJLabel.setLocation(90,20);
		mediaDialog.add(idJLabel);
		idField.setSize(250, 30);
		idField.setLocation(200,20);
		mediaDialog.add(idField);
		
		costJLabel.setSize(100,30);
		costJLabel.setLocation(90,60);
		mediaDialog.add(costJLabel);
		costField.setSize(250, 30);
		costField.setLocation(200,60);
		mediaDialog.add(costField);
		
		categoryJLabel.setSize(100,30);
		categoryJLabel.setLocation(90,100);
		mediaDialog.add(categoryJLabel);
		cateField.setSize(250, 30);
		cateField.setLocation(200,100);
		mediaDialog.add(cateField);
		
		titleJLabel.setSize(100,30);
		titleJLabel.setLocation(90,140);
		mediaDialog.add(titleJLabel);
		titleField.setSize(250, 30);
		titleField.setLocation(200,140);
		mediaDialog.add(titleField);
		
		
		okJButton.setSize(100,30);
		okJButton.setLocation(200,330);
		okJButton.setFocusPainted(false);
		mediaDialog.add(okJButton);
		
		
		mediaDialog.setVisible(false);
		mediaDialog.setModal(true);
	}
	
}
