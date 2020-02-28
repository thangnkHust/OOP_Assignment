import javax.swing.JOptionPane;
import java.util.Scanner;

public class Equation{
    public static void main(String[] args) {
        int select;
        do{
            System.out.println("===========MENU===========");
            System.out.println("1, Phương trình bậc nhất 1 ẩn.");
            System.out.println("2, Phương trình bậc nhất 2 ẩn.");
            System.out.println("3, Phương trình bậc hai 1 ẩn.");
            System.out.println("4, Thoát!");
            System.out.printf("Hãy lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();
            // System.out.println(select);
            switch(select){
                case 1:
                    String strA, strB;
                    strA = JOptionPane.showInputDialog(null, "Enter a: ", "Phương trình ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
                    strB = JOptionPane.showInputDialog(null, "Enter b: ", "Phương trình ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
                    Double a = Double.parseDouble(strA);
                    Double b = Double.parseDouble(strB);
                    if(a == 0 && b != 0){
                        JOptionPane.showInternalMessageDialog(null, "Phương trình vô nghiệm", "Nghiệm phương trình ax + b = 0", JOptionPane.ERROR_MESSAGE);
                    }else if(a == 0 && b == 0){
                        JOptionPane.showInternalMessageDialog(null, "Phương trình có vô số nghiệm", "Nghiệm phương trình ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "Phương trình có 1 nghiệm duy nhất: x = " + -b/a, "Nghiệm phương trình ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    String strA11, strA12, strB1, strA21, strA22, strB2;
                    strA11 = JOptionPane.showInputDialog(null, "Nhập a11: ", "a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE);
                    strA12 = JOptionPane.showInputDialog(null, "Nhập a12: ", "a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE);
                    strB1 = JOptionPane.showInputDialog(null, "Nhập b1: ", "a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE);
                    strA21 = JOptionPane.showInputDialog(null, "Nhập a21: ", "a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE);
                    strA22 = JOptionPane.showInputDialog(null, "Nhập a21: ", "a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE);
                    strB2 = JOptionPane.showInputDialog(null, "Nhập b2: ", "a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE);
                    Double a11 = Double.parseDouble(strA11);
                    Double a12 = Double.parseDouble(strA12);
                    Double b1 = Double.parseDouble(strB1);
                    Double a21 = Double.parseDouble(strA21);
                    Double a22 = Double.parseDouble(strA22);
                    Double b2 = Double.parseDouble(strB2);
                    Double D = a11*a22 - a12*a21;
                    Double D1 = b1*a22 - b2*a12;
                    Double D2 = a11*b2 - a21*b1;
                    if(D != 0){
                        JOptionPane.showInternalMessageDialog(null, "x1 = " + D1/D + "\n" + "x2 = " + D2/D, "Nghiệm hệ phương trình bậc nhất 2 ẩn", JOptionPane.INFORMATION_MESSAGE);
                    }else if(D1 == 0 && D2 == 0){
                        JOptionPane.showInternalMessageDialog(null, "Hệ phương trình có vô số nghiệm", "Nghiệm hệ phương trình bậc nhất 2 ẩn", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "Hệ phương trình vô nghiệm", "Nghiệm hệ phương trình bậc nhất 2 ẩn", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    String str_a, str_b, str_c;
                    str_a = JOptionPane.showInputDialog(null, "Enter a: ", "Phương trình ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                    Double numA = Double.parseDouble(str_a);
                    while(numA == 0){
                        JOptionPane.showInternalMessageDialog(null, "Nhập a khác 0", "Error", JOptionPane.INFORMATION_MESSAGE);
                        str_a = JOptionPane.showInputDialog(null, "Nhập a: ", "Phương trình ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                        numA = Double.parseDouble(str_a);
                    }
                    str_b = JOptionPane.showInputDialog(null, "Nhập b: ", "Phương trình ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                    str_c = JOptionPane.showInputDialog(null, "Nhập c: ", "Phương trình ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                    Double numB = Double.parseDouble(str_b);
                    Double numC = Double.parseDouble(str_c);
                    Double delta = numB*numB - 4*numA*numC;
                    if(delta == 0){
                        JOptionPane.showInternalMessageDialog(null, "Phương trình có nghiệm kép: " + -numB/(2*numA), "Nghiệm pt ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                    }else if(delta > 0){
                        JOptionPane.showInternalMessageDialog(null, "Phương trình có 2 nghiệm phân biệt: \n" + "x1 = " + (-numB+Math.sqrt(delta))/(2*numA) + "\n" + "x2 = " + (-numB-Math.sqrt(delta))/(2*numA), "Nghiệm pt ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "Phương trình vô nghiệm", "Nghiệm pt ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    System.out.println("Thoát!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nhập case lỗi", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(select != 4);
        System.exit(0);
    }
}