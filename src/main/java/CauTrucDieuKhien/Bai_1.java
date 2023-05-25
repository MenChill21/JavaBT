/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CauTrucDieuKhien;
import javax.swing.JOptionPane;
/**
 *
 * @author menhu
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,solution;
        a=Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số a"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Nhập hệ số b"));
        if(a==0 && b==0){
            JOptionPane.showMessageDialog(null, "Phương trình vô số nghiệm");
        }else if(a==0 && b!=0){
            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
        }else if(a!=0 && b==0){
            JOptionPane.showMessageDialog(null, "Phương trình có nghiệm x = 0");
        }
        else{
            solution= -b / a;
           JOptionPane.showMessageDialog(null, "Phương trình có nghiệm nghiệm x = "+solution); 
        }
    
    }
    
}
