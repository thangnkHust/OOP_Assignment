package hust.soict.hedspi.gui.awt;

import java.awt.*;
import java.awt.event.*;

// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener, WindowListener{
	private Label lbCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	// Constructor to setup GUI components and events handlers
	public AWTCounter() {
		// super Frame, which is a Container
		// FlowLayout: the components from L-R and next row from T-B
		setLayout(new FlowLayout());
		
		// constructor components
		lbCount = new Label("Counter");
		// add components to container
		add(lbCount);
		
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		// btnCounter click then fired an ActionEvent
		// Handler called actionPerformed()
		btnCount.addActionListener(this);
		addWindowListener(this);
		
		setTitle("AWT title");
		setSize(250, 100);
		
//		System.out.println(this);
//		System.out.println(lbCount);
//		System.out.println(tfCount);
//		System.out.println(btnCount);
		
		// super Frame shows
		setVisible(true);
		
//		System.out.println(this);
//		System.out.println(lbCount);
//		System.out.println(tfCount);
//		System.out.println(btnCount);
	}
	
	public static void main(String[] args) {
		// Call the constructor to setup the GUI. by allocating an instance
		new AWTCounter();
	}
	
	public void actionPerformed(ActionEvent evt) {
		++count; // Increase the counter value
		// Display the counter value on the TextField tfCount
		tfCount.setText(count + ""); // convert to String
	}
	
	/* WindowEvent handlers */
   // Called back upon clicking close-window button
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  // Terminate the program
   }
 
   // Not Used, BUT need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   // For Debugging
   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
}
