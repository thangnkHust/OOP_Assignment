package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class CalculateTwoNumbers{
    public static void main(String[] args) {
        String strNum1, strNum2;
        Double num1, num2;

        strNum1 =  JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 =  JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, num1 + "+" + num2 + " = " + (num1+num2), "Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + "-" + num2 + " = " + (num1-num2), "Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + "*" + num2 + " = " + (num1*num2), "Result", JOptionPane.INFORMATION_MESSAGE);
        if(num2 == 0){
            JOptionPane.showMessageDialog(null, num1 + "/" + num2 + " = " + "error", "Result", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, num1 + "/" + num2 + " = " + (num1/num2), "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}