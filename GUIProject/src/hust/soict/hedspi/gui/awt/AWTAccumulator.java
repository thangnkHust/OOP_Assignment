package hust.soict.hedspi.gui.awt;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;     // Declare input Label
   private Label lblOutput;    // Declare output Label
   private TextField tfInput;  // Declare input TextField
   private TextField tfOutput; // Declare output TextField
   private int sum = 0;        // Accumulated sum, init to 0
 
   // Constructor to setup the GUI components and event handlers
   public AWTAccumulator() {
	   // Set layout of frame
      setLayout(new FlowLayout());
 
      lblInput = new Label("Enter an Integer: "); // Construct Label
      add(lblInput);               // "super" Frame container adds Label component
 
      tfInput = new TextField(10); // Construct TextField
      add(tfInput);                // "super" Frame adds TextField
      
      // call event
      tfInput.addActionListener(this);
 
      lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
      add(lblOutput);               // "super" Frame adds Label
 
      tfOutput = new TextField(10); // allocate TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);                // "super" Frame adds TextField
 
      setTitle("AWT Accumulator");  // "super" Frame sets title
      setSize(350, 120);  // "super" Frame sets initial window size
      setVisible(true);   // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an anonymous instance
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back upon hitting "enter" key on TextField
   @Override
   public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText(sum + ""); // Display sum on the output TextField
                                  // convert int to String
   }
}